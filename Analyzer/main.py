"""Made by Juan Sebastian Becerra 
   Juan Sebastian Peña
"""
"""Funcion Main del analizador Lexico, es necesario tener los casos de prueba guardados
   en la carpeta entradas y estos casos se pasan como parametros por consola
"""
import sys

def help_msg():
   print(
            "Usage: main.py [OPTIONS] [FILE]\n"
            "Syntatic analyzer and lexer analyzer code\n\n"
            "OPTIONS:\n"
            "--help: Print this message\n"
            'FILE: The name of the code to analyze\n'
        )

def main():
   arguments = sys.argv
   if len(arguments) <= 1:
      return help_msg()
   if arguments[1] == "--help":
      return help_msg()
   else:
      from syntaticAnalyzer import analyzeCode
      analyzeCode()

if __name__ == '__main__':
   main()