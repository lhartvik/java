##### BadCoder
BadCoder has written code tightly coupled to the HugeObject and uses public fields to access values.

###### The plain test
When I want to test this, I must supply lots of stuff even though the only relevant value is the name.

###### The worse test
BadCoder has created an undocumented Util for creating the test object. 
This opens a series of risks. If I can't make a test to assert that the name of the HugeObject is different from the person.name. This may cause a false positive.

##### RefactoredBadCode
HugeObject has been replaced with an interface. The old method should still work. A test can now be made using only the releveant information. No confusion.
To test other things in HugeObject, I'd use Mockito for supplying a test implementation for that interface.