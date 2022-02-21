# RTES Yocto Exam

## Installation
___

1. Add `meta-exam` under the **poky** directory
2. Add apps to **IMAGE_INSTALL** in `local.conf`:

   ```
   ...
   IMAGE_INSTALL:append = " zip vim openssh iperf2 petaloso"
   ...
   ```
3. Add path directory to **BBLAYERS**  in `bblayers.conf`:

   ```
    BBLAYERS ?= "
      ...
      /path/to/meta-exam/directory \
      ...
    "
   ```
4. Rebuild
   ```
      bitbake core-image-minimal
   ```
5. ### Enjoynt !

## Usage
___

To use `zip`, `vim`, `openssh` and `iperf2` you have to refer to relative docs.

To use `petaloso` app you have to invoke the app and set 2 parameters randomically, that indicate the **number of threads** (+1) to use.
```
petaloso 40 30
```
