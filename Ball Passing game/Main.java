import sys
FWD_SLASH = 1
BACK_SLASH = 2
DIRECTION_UP = 0;
DIRECTION_DOWN = 1;
DIRECTION_RIGHT = 2;
DIRECTION_LEFT = 3;
K = int(input())
a_pos_row, a_pos_col = map(int, input().split())
b_pos_row, b_pos_col = map(int, input().split())
play_field = []
for i in range(K):
    play_field.append([int(j) for j in input().split()])
min_step = sys.maxsize
min_barriers = sys.maxsize
for i in range(4):
	direction = i
	curr_row = b_pos_row
	curr_col = b_pos_col
	step = 0
	barrier_count = 0
	while(True):
		if(curr_col < 0 or curr_col >= K or curr_row < 0 or curr_row >= K):
			break
		if(curr_row == a_pos_row and curr_col == a_pos_col):
				      
			if(min_step > step):
				min_step = step
				min_barriers = barrier_count
			elif (min_step == step and min_barriers > barrier_count):
				min_barriers = barrier_count	
			break;
		step = step + 1
		if(play_field[curr_row][curr_col] == 1 or play_field[curr_row][curr_col] == 2):
			barrier_count = barrier_count + 1
		if(direction == 0):
			if(play_field[curr_row][curr_col] == FWD_SLASH):
				curr_col = curr_col + 1
				direction = DIRECTION_RIGHT;
			elif(play_field[curr_row][curr_col] == BACK_SLASH):
				curr_col = curr_col - 1
				direction = DIRECTION_LEFT
			else:
				curr_row = curr_row - 1
				
		elif(direction == 1):
			if(play_field[curr_row][curr_col] == FWD_SLASH):
				curr_col = curr_col - 1
				direction = DIRECTION_LEFT;
			elif(play_field[curr_row][curr_col] == BACK_SLASH):
				curr_col = curr_col + 1
				direction = DIRECTION_RIGHT
			else:
				curr_row = curr_row + 1
				
		elif(direction == 3):
			if(play_field[curr_row][curr_col] == FWD_SLASH):
				curr_row = curr_row + 1
				direction = DIRECTION_DOWN;
			elif(play_field[curr_row][curr_col] == BACK_SLASH):
				curr_row = curr_row -1
				direction = DIRECTION_UP;
			else:
				curr_col = curr_col - 1
				
		elif(direction == 2):
			if(play_field[curr_row][curr_col] == FWD_SLASH):
				curr_row = curr_row - 1
				direction = DIRECTION_UP;
			elif(play_field[curr_row][curr_col] == BACK_SLASH):
				curr_row = curr_row + 1
				direction = DIRECTION_DOWN;
			else:
				curr_col = curr_col + 1
		
	
if(min_step != sys.maxsize):
	print(min_step, min_barriers)
else:
    print("-1");
		