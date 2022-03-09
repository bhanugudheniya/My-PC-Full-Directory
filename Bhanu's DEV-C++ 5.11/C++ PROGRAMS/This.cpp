#include<iostream>
using namespace std;

class soloThis{
	public:
		soloThis(int a) : var(a)
		{ 	}
		void printInfo(){
			cout<<var <<endl;
			cout<<this->var <<endl;
			cout<< (*this).var <<endl;
		}
		private:
			int var;
};

int main(){
	soloThis obj(42);
	obj.printInfo();
}
