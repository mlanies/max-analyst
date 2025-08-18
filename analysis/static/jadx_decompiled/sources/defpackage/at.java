package defpackage;

import android.view.Menu;
import android.view.ViewGroup;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class at implements c6d {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ at(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.c6d
    public final Iterator iterator() {
        switch (this.a) {
            case 0:
                return new u1(2, (Object[]) this.b);
            case 1:
                return new u1(1, (float[]) this.b);
            case 2:
                return ((Iterable) this.b).iterator();
            case 3:
                return new ai7(this);
            case 4:
                return new u1(3, (Menu) this.b);
            case 5:
                return m6d.u((a66) this.b);
            case 6:
                return (Iterator) this.b;
            default:
                return new u1(4, (ViewGroup) this.b);
        }
    }
}
