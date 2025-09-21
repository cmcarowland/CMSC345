import math
import unittest

class Circle:
    def __init__(self, radius):
        self.radius=radius
        if not isinstance(self.radius,(int,float)):
            raise TypeError("radius must be a number")
        elif(self.radius > 1000 or self.radius < 0):
            raise ValueError("radius must be between 0 and 1000 inclusive")
        else:
            pass

    def area(self):
        return round(math.pi*(self.radius**2),2)
               
    def circumference(self):
        return round(math.pi*(self.radius*2),2)
        
class TestCircle(unittest.TestCase):
    def test_circle(self):
        c1 = Circle(2.5)
        self.assertIs(type(c1), Circle)

    def test_circle_with_random_numeric_radius(self):
        c1 = Circle(3.125)
        self.assertEqual(c1.circumference(), 19.63)
        
    def test_circle_with_min_radius(self):
        c2 = Circle(0)
        self.assertEqual(c2.circumference(),0)
    
    def test_circle_max_radius(self):
        try:
            c3 = Circle(1000)
            self.assertEqual(c3.circumference(),6283.19)
        except ValueError as e:
            self.assertEqual(str(e), "radius must be between 0 and 1000 inclusive")
        
    def test_circle_above_max_radius(self):
        try:
            c3 = Circle(1000.1)
            self.assertEqual(c3.circumference(),6283.19)
        except ValueError as e:
            self.assertEqual(str(e), "radius must be between 0 and 1000 inclusive")

    def test_area_with_random_numeric_radius(self):
        c1 = Circle(3.125)
        self.assertEqual(c1.area(), 30.68)

    def test_area_with_min_radius(self):
        c2 = Circle(0)
        self.assertEqual(c2.area(), 0)

    def test_area_with_max_radius(self):
        c3 = Circle(1000)
        self.assertEqual(c3.area(), 3141592.65)

    def test_area_with_typical_radius(self):
        c4 = Circle(10)
        self.assertEqual(c4.area(), 314.16)
    

if __name__ == '__main__':
    runner = unittest.TextTestRunner
    unittest.main(testRunner=runner, exit=False)
                       
    print(TestCircle.test_circle.__doc__)

    