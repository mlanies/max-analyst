package defpackage;

import android.app.Person;
import android.graphics.PorterDuff;
import android.graphics.drawable.Icon;
import androidx.core.graphics.drawable.IconCompat;
import java.io.FileNotFoundException;

/* loaded from: classes.dex */
public abstract class jua {
    public static kua a(Person person) {
        IconCompat iconCompatA;
        CharSequence name = person.getName();
        if (person.getIcon() != null) {
            Icon icon = person.getIcon();
            PorterDuff.Mode mode = IconCompat.k;
            iconCompatA = cs6.a(icon);
        } else {
            iconCompatA = null;
        }
        String uri = person.getUri();
        String key = person.getKey();
        boolean zIsBot = person.isBot();
        boolean zIsImportant = person.isImportant();
        kua kuaVar = new kua();
        kuaVar.a = name;
        kuaVar.b = iconCompatA;
        kuaVar.c = uri;
        kuaVar.d = key;
        kuaVar.e = zIsBot;
        kuaVar.f = zIsImportant;
        return kuaVar;
    }

    public static Person b(kua kuaVar) throws FileNotFoundException {
        Person.Builder name = new Person.Builder().setName(kuaVar.a);
        Icon iconD = null;
        IconCompat iconCompat = kuaVar.b;
        if (iconCompat != null) {
            iconCompat.getClass();
            iconD = cs6.d(iconCompat, null);
        }
        return name.setIcon(iconD).setUri(kuaVar.c).setKey(kuaVar.d).setBot(kuaVar.e).setImportant(kuaVar.f).build();
    }
}
