package org.superbiz.moviefun.albums;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;
import org.superbiz.moviefun.blobstore.BlobStore;

import java.util.List;

@RestController
@RequestMapping("/albums")
public class AlbumsController {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());
    private final AlbumsRepository albumsRepository;

    public AlbumsController(AlbumsRepository albumsRepository) {
        this.albumsRepository = albumsRepository;
    }

    @PostMapping
    public void addAlbum(@RequestBody Album album){
        logger.info("AlbumsRestController:addAlbum({})", album.getTitle());
        albumsRepository.addAlbum(album);
        //return new ResponseEntity<String>("Album Added", HttpStatus.OK);
    }

    @GetMapping
    public List<Album> index() {
        logger.info("AlbumsRestController:index(getAllAlbums)");
        return albumsRepository.getAlbums();
    }

    @GetMapping("/{albumId}")
    public Album details(@PathVariable long albumId) {
        logger.info("AlbumsRestController:details(albumId: {})", albumId);
        return albumsRepository.find(albumId);
    }


}
