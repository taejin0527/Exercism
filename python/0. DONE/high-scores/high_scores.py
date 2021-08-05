"""
@task
return 
    - the highest score from the list
    - the last added score
    - the three highest scores
"""


def latest(scores) -> int:
    # the last added score

    return scores[-1]


def personal_best(scores) -> int:
    # the highest score from the list

    return max(scores)


def personal_top_three(scores) -> list:
    # the three highest scores

    scores.sort(reverse=True)

    return scores[:3]
