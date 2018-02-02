# Movie Fun!

## Build

### Build JAR

```bash
$ ./gradlew clean assemble
```

### Run Smoke Tests

```bash
./gradlew test
```

Smoke Tests require server running on port 8080 by default. To run against a custom URL run
```bash
$ MOVIE_FUN_URL=http://moviefun.example.com ./gradlew test
```

## Deploying to PCF

After running the build, deploy the application with
```bash
./gradlew deploy
```

Reset the entire PCF environment with
```bash
./gradlew resetPcfEnv
```

## Migrations

Create databases needed for local development with

```bash
mysql -uroot < databases/create_databases.sql
```

Run local migrations with

```bash
./gradlew flywayMigrate
```

Run migrations on the PCF environment which you're logged in to with

```bash
CF_MIGRATE=true ./gradlew cfMigrate
```


"access_key_id": "AKIAJV7ZVDJJCC2AFXVA",
     "bucket": "cf-04a307a8-36bb-4345-8e61-17d02b8e493b",
     "region": "ap-southeast-1",
     "secret_access_key": "FCXQwbXvxjuYdxq0yHZArF1oAcYJRAv3RB8/nAla"
