def print_board(board):
    for row in board:
        print(" ".join(row))

def main():
    print("WELCOME TO A GAME OF TIC TAC TOE")
    name = input("Please register your name: ")
 
    for _ in range(9):
        choice = input("Enter X or O: ")
        row, col = map(int, input("Which row and column do you want your input to go? (e.g., 1 2): ").split())
        board[row - 1][col - 1] = choice
        print_board(board)

