package defpackage;

import android.util.SparseArray;

/* loaded from: classes.dex */
public final class sec implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ tec b;

    public /* synthetic */ sec(tec tecVar, int i) {
        this.a = i;
        this.b = tecVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                SparseArray sparseArray = this.b.h;
                int size = sparseArray.size();
                for (int i = 0; i < size; i++) {
                    ((vec) sparseArray.valueAt(i)).getClass();
                }
                sparseArray.clear();
                break;
            default:
                tec tecVar = this.b;
                yec yecVar = tecVar.i;
                if (yecVar.y0 == tecVar) {
                    if (yec.B0) {
                        yecVar.toString();
                    }
                    yecVar.k();
                    break;
                }
                break;
        }
    }
}
