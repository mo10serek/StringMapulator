'
' Created by: Michael Balcerzak
' Created on: 15-Sep-2016
' Created for: ICS4U
' Weekly Assignment – #1
' This program display the highest number of the most chartures in a string
'

Public Class frmStringManpulator
    Public Function maxRun(str As String) As Integer

        'all the alphabet
        Dim alphabet() As Char = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "o", "m", "p", "q", "r", "s", "t", "u", "v", "w", "x", "z"}

        'count each letter
        Dim charatureCount(23) As Integer

        For counter As Integer = 0 To 23

            For counter2 As Integer = 0 To (str.Length - 1)

                If str.Chars(counter2) = alphabet(counter) Then

                    charatureCount(counter) += 1
                End If
            Next
        Next

        'find the max value
        Dim maxValue As Integer = charatureCount(0)

        For counter3 As Integer = 0 To (charatureCount.Length - 1)

            If charatureCount(counter3) > maxValue Then

                maxValue = charatureCount(counter3)
            End If
        Next

        Return maxValue

    End Function


    Private Sub Button1_Click(sender As Object, e As EventArgs) Handles btnGo.Click

        'input
        Dim stringInput As String = Convert.ToString(txtString.Text)

        'procedure
        Dim maxValue As Integer = maxRun(stringInput)

        'output
        lblResults.Text = "the max value is " + Convert.ToString(maxValue)

    End Sub
End Class
