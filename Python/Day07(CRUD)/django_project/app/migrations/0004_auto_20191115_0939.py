# Generated by Django 2.2.7 on 2019-11-15 00:39

from django.db import migrations, models


class Migration(migrations.Migration):

    dependencies = [
        ('app', '0003_subway'),
    ]

    operations = [
        migrations.AlterField(
            model_name='subway',
            name='bread',
            field=models.CharField(max_length=20),
        ),
        migrations.AlterField(
            model_name='subway',
            name='date',
            field=models.DateTimeField(),
        ),
        migrations.AlterField(
            model_name='subway',
            name='menu',
            field=models.CharField(max_length=20),
        ),
        migrations.AlterField(
            model_name='subway',
            name='name',
            field=models.CharField(max_length=20),
        ),
        migrations.AlterField(
            model_name='subway',
            name='size',
            field=models.IntegerField(),
        ),
        migrations.AlterField(
            model_name='subway',
            name='source',
            field=models.CharField(max_length=100),
        ),
    ]