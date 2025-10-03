class Solution:
    def getSneakyNumbers(self, nums):
        xor_sum = 0
        total_size = len(nums)
        actual_size = len(nums) - 2

        # XOR all elements of the array
        for num in nums:
            xor_sum ^= num

        # XOR all numbers from 0 to actual_size - 1
        for i in range(actual_size):
            xor_sum ^= i

        # Find the rightmost set bit in xor_sum
        rightmost_set_bit = xor_sum & ~(xor_sum - 1)

        first_sneaky_number = 0
        second_sneaky_number = 0

        # Separate the numbers into two groups based on the rightmost set bit
        for num in nums:
            if num & rightmost_set_bit:
                first_sneaky_number ^= num
            else:
                second_sneaky_number ^= num

        # XOR the range of numbers from 0 to actual_size - 1
        for i in range(actual_size):
            if i & rightmost_set_bit:
                first_sneaky_number ^= i
            else:
                second_sneaky_number ^= i

        return [first_sneaky_number, second_sneaky_number]