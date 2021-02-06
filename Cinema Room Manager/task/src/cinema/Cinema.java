package cinema;
import java.util.Arrays;
import java.util.Scanner;

public class Cinema {
    public static Scanner input = new Scanner(System.in);


    public static void main(String[] args) {
            final var input = new Scanner(System.in);
            int _crows, _cseats, _urow, _useat, _uchoice;
            int _saledticket = 0;
            int _totalsimcome = 0;
            int _currentincome = 0;
            int _ticketPrice = 0;
            double _percentage = 0;
            boolean _loopcontrol = true;
            int _par;
            System.out.println("Enter the number of rows:");
            _crows = input.nextInt();
            System.out.println("Enter the number of seats in each row:");
            _cseats = input.nextInt();
            char[][] cinema = new char[_crows][_cseats];

            for (char[] chars : cinema) Arrays.fill(chars, 'S');
            while(_loopcontrol){
            _mUserchoice();
            _uchoice = input.nextInt();
                switch (_uchoice) {
                    case 0:
                        _loopcontrol = false;
                        break;
                    case 1:
                        _mShowseats(cinema);
                        break;
                    case 2:
                        try {
                            System.out.println("Enter a row number:");
                            _urow = input.nextInt();
                            System.out.println("Enter a seat number in that row:");
                            _useat = input.nextInt();
                            _ticketPrice = (_crows * _cseats > 60) ? ((_urow > _crows / 2) ? 8 : 10) : 10;
                            if (cinema[_urow - 1][_useat - 1] == 'B') {
                                do {
                                    System.out.println("That ticket has already been purchased!");
                                    System.out.println("Please choose another");
                                    System.out.println("Enter a row number:");
                                    _urow = input.nextInt();
                                    System.out.println("Enter a seat number in that row:");
                                    _useat = input.nextInt();
                                    _ticketPrice = (_crows * _cseats > 60) ? ((_urow > _crows / 2) ? 8 : 10) : 10;
                                } while (cinema[_urow - 1][_useat - 1] == 'B');
                                System.out.println("Ticket price: $" + _ticketPrice);
                                cinema[_urow - 1][_useat - 1] = 'B';
                                _saledticket++;
                            } else if (cinema[_urow - 1][_useat - 1] != 'B') {
                                System.out.println("Ticket price: $" + _ticketPrice);
                                cinema[_urow - 1][_useat - 1] = 'B';
                                _saledticket++;
                            }
                        } catch (ArrayIndexOutOfBoundsException exception){
                                System.out.println("Wrong input!");
                                System.out.println("Enter a row number:");
                                _urow = input.nextInt();
                                System.out.println("Enter a seat number in that row:");
                                _useat = input.nextInt();
                                _ticketPrice = (_crows * _cseats > 60) ? ((_urow > _crows / 2) ? 8 : 10) : 10;
                        }
                        break;
                    case 3:
                        try {
                            _currentincome = _saledticket * _ticketPrice;
                            // wrong here
                            _par = _crows / 2;
                            _totalsimcome = _par * _cseats * 10 + (_crows - _par) * _cseats * 8;
                            double _suma = _totalsimcome;
                            double _sumb = _currentincome;
                            _percentage = (100 / _suma) * _sumb;
                            System.out.printf("Number of purchased tickets: %d \n", _saledticket);
                            // %.2f% will not work must do %c for character and then add '%'
                            System.out.printf("Percentage: %.2f%c\n", _percentage,'%');
                            System.out.printf("Current income: $%d \n", _currentincome);
                            System.out.printf("Total income: $%d \n", _totalsimcome);
                        }
                        catch (ArithmeticException exception){
                            // no ticket was saled
                            System.out.println("Number of purchased tickets: 0 \n");
                            System.out.println("Percentage: 0.00% \n");
                            System.out.println("Current income: $0 \n");
                            System.out.printf("Total income: $%d \n",_totalsimcome);                        }
                        break;
                    default:
                        break;
                }
            }

        }

        private static void _mShowseats(char[][] cinema) {
            System.out.print("Cinema:\n  ");
            for (int i = 1; i <= cinema[1].length; i++) {
                System.out.print(i + " ");
            }
            for (int i = 0; i < cinema.length; i++) {
                System.out.print("\n" + (i + 1) + " ");
                for (int j = 0; j < cinema[i].length; j++) {
                    System.out.print(cinema[i][j] + " ");
                }
            }
            System.out.println(" ");
        }

        public static void _mUserchoice(){
            System.out.println("1. Show the seats\n");
            System.out.println("2. Buy a ticket\n");
            System.out.println("3. Statistics\n");
            System.out.println("0. Exit\n");

        }
    }