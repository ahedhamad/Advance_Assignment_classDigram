# Advance_Assignment_classDigram

## Q1. Problems in the Design

### Problems:
- **Dependency between Classes:** 
  - All classes are interdependent. Modifications to the Entity class require changes in Player, Monster, MonsterFast, and MonsterStealth classes.
  
### Maintainability:
- **Difficulty in Maintenance:**
  - Hard to maintain, debug, and refactor due to heavy interdependencies among classes.
  - Complex modifications due to tight coupling between classes.

### Example Scenario - Adding a New Monster (Fast and Stealth):
- **Challenges:**
  - Adding new monsters requires modifications to multiple superclasses (Entity and Monster).
  - Complex inheritance relationships make it challenging to understand, debug, and refactor code.

## Q2. Design Improvements

### A. ![Advance](https://user-images.githubusercontent.com/99614732/194774976-a5fa9a18-2d25-4d09-9d25-fe36885acb78.png)

### B. Code

### C. Design Enhancements

### Changes Made:
1. **Reduced Class Dependencies:**
   - Eliminated direct inheritance between Monster, MonsterFast, and MonsterStealth.
   - Introduced an Interface (IMonsterWays) with methods to be overridden.
   - Abstract parent class (MyMonsterWays) implements the interface.
   - Child classes (MonsterFast, MonsterStealth) override specific methods as required.

2. **Interface Implementation (IMakeNoise):**
   - Created an interface (IMakeNoise) with a 'makeNoise' function.
   - Implemented only in the Monster class, allowing distinct noise methods for monsters.

3. **Enhanced Maintainability:**
   - Reduced interdependencies for easier maintenance, refactoring, and debugging.
