def convert(number):
    """
    3 => 'Pling' 
    5 => 'Plang'
    7 => 'Plong'
    else => digits of the number.
    """
    raindrops = ''

    if number % 3 == 0:
        raindrops += 'Pling'
    if number % 5 == 0:
        raindrops += 'Plang'
    if number % 7 == 0:
        raindrops += 'Plong'

    if not raindrops:
        raindrops = str(number)

    return raindrops
