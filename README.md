# RecyclerViewSnapHelper

![Alt Text](https://media.giphy.com/media/QTg9q0wZtkH19L1aWL/giphy.gif)


## What is SnapHelper?
 
 
 SnapHelper is a helper class that helps in snapping any child view of the RecyclerView.
 For example, you can snap the firstVisibleItem of the RecyclerView as you must have seen in the play store application 
 that the firstVisibleItem will be always completely visible when scrolling comes to the idle position.

## How to use?

Its very simple to use Snaphelper. You just need to attach your `RecyclerView` with SnapHelper like below,

       //snapHelper to stick to a view when scrolling
        val snapHelper = PagerSnapHelper()
        snapHelper.attachToRecyclerView(rvHorizontal)
        
Happie Coding:)                

