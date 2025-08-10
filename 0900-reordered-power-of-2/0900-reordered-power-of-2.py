class Solution:
    def sortDigits(self, num: int) -> str:
        return ''.join(sorted(str(num)))

    def reorderedPowerOf2(self, n: int) -> bool:
        s = self.sortDigits(n)
        for i in range(31):
            power = 1 << i
            if s == self.sortDigits(power):
                return True
        return False