# RTES Yocto Exam

## Installation
___

1. Add `meta-exam` under the **poky** directory
2. Add apps to **IMAGE_INSTALL** in `local.conf`:

   ```
   ...
   IMAGE_INSTALL:append = " zip vim openssh iperf2"
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