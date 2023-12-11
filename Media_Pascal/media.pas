program CalculaMedia;

var
  soma: real;
  contador: integer;
  numero: real;
  media: real;

begin

  soma := 0;

  for contador := 1 to 3 do
  begin
    write('Digite um numero: ');
    readln(numero);
    soma := soma + numero;
  end;

  media := soma / 3;

  writeln('Media = ', media:0:1);

  readln;
end.
