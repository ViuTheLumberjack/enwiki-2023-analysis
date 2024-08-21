# Project for the Course in Advanced Algorithms and Graph Mining 2023/2024

This project is part of the course in Advanced Algorithms and Graph Mining 2023/2024 at the University of Florence.
Here we answer the fourth question, regarding the usage of WebGraph to analyze the english wikipedia 2023 graph.

## Project Description

This project will answer the following questions: 

I - Compute the in-degree distribution in G: which are the top-10 pages with largest indegree?

D - Answer to the chosen question and repeat the question removing from the graphs the nodes whose name contains the string "disambigua": Considering G, compute the largest strongly connected component (It might be necessary to implement DFS using stacks and not recursive). For Computer Scientists and Computer Engineers: Compute the bow-tie in figure 9 of this paper: https://snap.stanford.edu/class/cs224w-readings/broder00bowtie.pdf, saying for each nodes if it is in the SCC, in OUT, in IN, in Tendrils, in Tubes.

3 - Considering U(G), build an algorithm to find: A Maximal Matching (or independent edge set): https://mathworld.wolfram.com/MaximalIndependentEdgeSet.html
(if you have to find a maximal set, you should find a non-trivial one, i.e. containing at least 3 elements)

Can you find two of them instead of only one?

And since I'm a Computer Engineer, I will also implement the following:

* Repeat the chosen questions, using this dataset instead. https://drive.google.com/file/d/1BBnXGzAnloZXX6-0pf-aQqQmb-h-iCU7/view?usp=sharing The graph in this dataset represent a snapshot of the Italian part of Wikipedia as of 2023. You can choose any other tool/language to do it. For instance, a good tool is webgraph, available at https://law.di.unimi.it/index.php. Using webgraph, this graph occupies only 267M (see https://law.di.unimi.it/webdata/enwiki-2023/)
* Modify the algorithm you have chosen in Question 3 to produce all the solutions, for instance all the maximal cliques, printing all the solutions exactly once. This could require a lot of time. You can restrict to a random subgraph of 100 vertices and run your algorithm only on that one. We encourage you to look at the literature on the Internet to find one algorithm that does this job and implement that one. If you are looking for smarter algorithms, this website could be of interest: https://kunihirowasa.github.io/enum/
* Modify the algorithm to find the minimum (if we are looking for minimal) or the maximum (if we are looking for maximal), resp. the solution with minimum number of elements or with maximum number of elements.

## Answers

Regarding the English Wikipidia:

I - The pages with the largest in-degree are, in order:

- Stati Uniti d'America
- Italia
- 2007
- 2006
- 2008
- 2004
- 2005
- 2009
- 2001
- 2010

D - There are 67956 Strongly connected components, the one with the most nodes has 946821 nodes. The bowtie structure is as follows:

- SCC: 946821
- IN: 61448
- OUT: 6410
- TENDRILS: 1498
- DISCONNECTED: 690


## Notes

- The algorihm used for the Strongly Connected Components is the one proposed by Tarjan without the Nuutila's modifications. Hence we have a 33% increase in execution time.

## References

* [Course Website](https://www.unifi.it/p-ins2-2019-480-0.html)
* [Depth-first search and linear graph algorithms, Tarjan](https://doi.org/10.1137/0201010)
* [On finding the strongly connected components in a directed graph, Nuutila](https://doi.org/10.1016/0020-0190(94)90047-7)
* [Bowtie, Broder](https://snap.stanford.edu/class/cs224w-readings/broder00bowtie.pdf)
* [Enumeration of maximal matchings](https://research.nii.ac.jp/~uno/papers/enummat_nii.pdf)