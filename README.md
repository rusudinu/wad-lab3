# Wad Lab 3 - JPA + Postgres + Redis

## Install Docker Desktop

### Windows
1. Download Docker Desktop for Windows: https://www.docker.com/products/docker-desktop/
2. Run the installer. If prompted, enable WSL 2 and the Virtual Machine Platform feature.
3. Restart if required, then open Docker Desktop.
4. Verify in a terminal:
   - `docker --version`
   - `docker compose version`

### macOS
1. Download Docker Desktop for Mac: https://www.docker.com/products/docker-desktop/
2. Open the .dmg and drag Docker to Applications.
3. Launch Docker Desktop and finish the setup prompts.
4. Verify in a terminal:
   - `docker --version`
   - `docker compose version`

## Start the services
From the repo root:
```
docker compose up -d
```

## Stop the services
```
docker compose down
```

## Remove data (optional)
```
docker compose down -v
```

## Connection info
Postgres:
- Host: `localhost`
- Port: `5432`
- User: `app`
- Password: `app_password`
- Database: `app_db`

Redis:
- Host: `localhost`
- Port: `6379`

## Customize
Edit `docker-compose.yml` to change ports or credentials.
