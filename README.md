# RTES Yocto Exam

## Installation
1. Clone repo in **poky** directory
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
      /path/to/dir/meta-exam/ \
      ...
    "
   ```
4. Rebuild
   ```
      bitbake core-image-minimal
   ```
5. ### Enjoynt !

## Usage

To use `zip`, `vim`, `openssh` and `iperf2` you have to refer to relative docs.<br>
`Petaloso` app [refers to this documentation at paragraph 7.5.3](http://didattica.agentgroup.unimo.it/didattica/ProgettazioneSO/Lucidi/Laboratorio/LittleBookOfSemaphores(Pag.127-250).pdf#page=111).


To use `petaloso` you have to invoke the app and set 2 parameters randomically, that indicate the **number of threads** (+1) to use.

**```**
petaloso 40 30
```
