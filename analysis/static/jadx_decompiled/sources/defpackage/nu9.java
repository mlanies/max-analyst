package defpackage;

import android.net.Uri;
import android.os.Bundle;
import java.util.List;

/* loaded from: classes.dex */
public final class nu9 {
    public final CharSequence a;
    public final long b;
    public final kua c;
    public final Bundle d = new Bundle();
    public String e;
    public Uri f;

    public nu9(CharSequence charSequence, long j, kua kuaVar) {
        this.a = charSequence;
        this.b = j;
        this.c = kuaVar;
    }

    public static Bundle[] a(List list) {
        Bundle[] bundleArr = new Bundle[list.size()];
        int size = list.size();
        for (int i = 0; i < size; i++) {
            nu9 nu9Var = (nu9) list.get(i);
            nu9Var.getClass();
            Bundle bundle = new Bundle();
            CharSequence charSequence = nu9Var.a;
            if (charSequence != null) {
                bundle.putCharSequence("text", charSequence);
            }
            bundle.putLong("time", nu9Var.b);
            kua kuaVar = nu9Var.c;
            if (kuaVar != null) {
                bundle.putCharSequence("sender", kuaVar.a);
                bundle.putParcelable("sender_person", mu9.a(jua.b(kuaVar)));
            }
            String str = nu9Var.e;
            if (str != null) {
                bundle.putString("type", str);
            }
            Uri uri = nu9Var.f;
            if (uri != null) {
                bundle.putParcelable("uri", uri);
            }
            Bundle bundle2 = nu9Var.d;
            if (bundle2 != null) {
                bundle.putBundle("extras", bundle2);
            }
            bundleArr[i] = bundle;
        }
        return bundleArr;
    }
}
