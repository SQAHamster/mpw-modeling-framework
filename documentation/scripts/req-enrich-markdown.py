import pyperclip
import re

print("Using clipboard text")
markdown = pyperclip.paste()

markdown = re.sub(r"([A-Z]+\-\d+)", r"**\1**", markdown)
markdown = re.sub(r"As a developer / student", r"As a _developer_ / _student_", markdown)
markdown = re.sub(r"As a (developer|student)", r"As a _\1_", markdown)
markdown = re.sub(r"(MUST HAVE)", "![MUST HAVE](https://github.com/SQAHamster/mpw-modeling-framework/blob/master/documentation/graphics/helpers/wiki_musthave.png)", markdown)
markdown = re.sub(r"(SHOULD HAVE)", "![MUST HAVE](https://github.com/SQAHamster/mpw-modeling-framework/blob/master/documentation/graphics/helpers/wiki_shouldhave.png)", markdown)
markdown = re.sub(r"(NICE TO HAVE)", "![MUST HAVE](https://github.com/SQAHamster/mpw-modeling-framework/blob/master/documentation/graphics/helpers/wiki_nicetohave.png)", markdown)
markdown = re.sub(r"(\d+ ms|\d+ x \d+|write\(String\)|readNumber|readString|INTERNAL|TODO)", r"`\1`", markdown)

pyperclip.copy(markdown)

