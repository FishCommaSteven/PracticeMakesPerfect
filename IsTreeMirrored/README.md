This problem involves a tree and determining if the tree has mirrored branches.

Nodes can contain data of any type, up to the individual (although int makes it easy).

Starting from the root node, does the left branch mirror the right branch? For example:

                                        R
                               A                A
                            F    D           D     F

The previous tree is mirrored.

                                        R
                               A                A
                            F     D          F     D
                            
The previous tree is NOT mirrored.

If the tree consists of just the Root node, it is mirrored. It the Root node is null the tree is not mirrored.
