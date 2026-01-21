# Welcome to Item Utils for Fabric 1.20.1!
I created this mod out of frustration from the lack of good automation filtering mods for Fabric.
Right now there is just the Item Extractor, which is a CC: Tweaked peripheral that can move items in between storages.
You're welcome. Might add more later.
## Using: The Item Extractor
Connect the extractor to a computer as you would any other peripheral, and make sure you have storage blocks above and below for item transfer (top: in bottom: out).
Find the peripheral in lua using any method you like, like 'peripheral.wrap()' or 'peripheral.find()'.
Run a request by calling 'PERIPHERAL_VAR_NAME.extract(ITEM_NAME, ITEM_AMOUNT)'. There is currently no limit as to how big or how many requests one can do.
The function will return the number of items successfully transferred.
