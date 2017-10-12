package staticvariables;

public class Counter {

static int count =0;

static int Count()
{
	 return count++;

}
static int getCount()
{
	return count;
}
}
// here first we initialize the count value as 0, then we return,
// then pass throught the next step and increase the value by 1 and return the value to count as 1
// written as 0.
// then pass throught next method and return the value  as 1

