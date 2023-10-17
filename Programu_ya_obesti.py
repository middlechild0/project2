
print('''

                ;,'
     _o_    ;:;'
 ,-.'---`.__ ;
((j`=====',-'
 `-\     /
    `-=-'     hjw
    
''')

print("KARIBU KWA PROGRAMU YA KUTAMBUA OBESTI YAKO")

uzito= int(input("Tafadhali weka uzani wako (kilogramu): "))
urefu = float(input("Tafadhali weka urefu wako (mita): "))

obesti = uzito / urefu **2

obesti_mpya = (round(obesti))

if obesti_mpya < 18.5:
	print(f"Obesti yako ni {obesti_mpya}, upo chini ya uzito.") 
elif obesti_mpya < 25:
	   print(f"Obesti yako Ni {obesti_mpya}, uko na uzito wa kawaida.")
elif obsti_mpya < 30:
	   print(f"Obesti yako ni {obesti_mpya}, uko juu ya uzito.")
elif obesti_mpya  < 35:
	   print(f"Obesti yako ni {obesti_mpya}, uko na obesti.")
else:
	   print(f"Obesti yako ni {obesti_mpya}, upo kwaenye Hali ya hatari ya obesti.")