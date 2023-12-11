using System;

class Program
{
    static void Main()
    {
        float media = 0;

        for (int i = 0; i < 3; i++)
        {
            Console.Write("Digite um numero: ");
            media += float.Parse(Console.ReadLine());
        }

        media /= 3;
        Console.WriteLine($"Media = {media:F1}");
    }
}