# Build instructions

1. If necessary update git submodules with
   ```
   git submodule update --init --recursive
   ```
2. Build applications with included script
   ```
   ./build-images.sh
   ```

   or manually with

   ```
   mvn package
   ```
3. Fire compose
   ```
   sudo docker-compose up
   ```

# Environment

* Zuul should be available on port :8765 of local machine
* To inspect components use
   ```
   sudo docker network ls
   ```

   to find the network name (e.g. iosrproject_default), and then

   ```
   sudo docker network inspect iosrproject_default
   ```
