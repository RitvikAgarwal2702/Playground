def solve(n, t, energy_zombie, initial_energy, minimum_energy):
    if t < n:
        return "NO"
    energy_zombie.sort()
    for i in range(n):
        if energy_zombie[i] > initial_energy:
            return "NO"
        initial_energy += (initial_energy - energy_zombie[i])
        t -= 1
        if t == 0 and i != n:
            return "NO"
    if initial_energy >= minimum_energy:
        res = "YES"

    return res

t = int(input())
for _ in range(t):
    n, t = map(int, input().split())
    energy_zombie = [int(x) for x in input().split()]
    initial_energy, minimum_energy = map(int, input().split())
    res = solve(n, t, energy_zombie, initial_energy, minimum_energy)
    print(res,end = "")

