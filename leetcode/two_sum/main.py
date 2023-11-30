class Solution:
    def twoSum(self, nums: list[int], target: int) -> list[int]:
        num_indices = {}

        for i, num in num_indices:
            complement = target - num

            if complement in num_indices:
                return [num_indices[complement], i]

            num_indices[num] = i

        return []


solution = Solution()
nums = [2, 7, 11, 15]
target = 9
result = solution.twoSum(nums, target)
print(result)
