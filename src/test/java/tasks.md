
1.
  Given one char 'a'
  When call Permutation.call
  Then output list is [a]

2.
  Given two chars 'ab'
  When call Permutation.call()
  Then output list is [ab,ba]

3.
  Given two chars 'abc'
  When call Permutation.call()
  Then output list is [abc,acb,bac,bca,cab,cba]