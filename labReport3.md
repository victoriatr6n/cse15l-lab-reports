# Lab Report 3
# Bug - reverseInPlace() method
``
 static void reverseInPlace(int[] arr) {
    for(int i = 0; i < arr.length; i += 1) {
      arr[i] = arr[arr.length - i - 1];
    }
  }
``
## Failure inducing input:
``
@Test
  public void testReverseInPlaceDoesntWork(){
    int [] input = {1, 2, 3};
    ArrayExamples.reverseInPlace(input);
    assertArrayEquals(new int[]{3,2,1}, input); 
  }
``
## Input that doesn't induce a failure:
``
@Test 
	public void testReverseInPlace() {
    int[] input1 = { 3 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 3 }, input1);
	}
``
## Symptom:


## Bug and Fix:
Original code with bug:
``
 static void reverseInPlace(int[] arr) {
    for(int i = 0; i < arr.length; i += 1) {
      arr[i] = arr[arr.length - i - 1];
    }
  }
``

Fixed code:
``
 static void reverseInPlace(int[] arr) {
    int firstElement = arr[0];
    for(int i = 0; i < arr.length-1; i += 1) {
      arr[i] = arr[arr.length - i - 1]; 
    }
    arr[arr.length-1] = firstElement;
  }
``
The bug in the code is that the `reversedInPlace` method loses the first element of the original array, so once the for loop gets to the last element, it will set it to the first element of the updated array, which is the last element of the original array. To fix this bug, make a variable `int firstElement = arr[0];` before the for loop. Then, iterate up until the second to last element, so the condition in the for loop should be `i< arr.length -1;` after the for loop completely iterates, set `arr[arr.length-1] = firstElement;` This will make sure that the original first element gets saved and then added back to the reversed array.


