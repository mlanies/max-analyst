package defpackage;

import android.view.View;
import android.widget.AdapterView;

/* loaded from: classes.dex */
public final class rl7 implements AdapterView.OnItemSelectedListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ rl7(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    private final void a(AdapterView adapterView) {
    }

    private final void b(AdapterView adapterView) {
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        es4 es4Var;
        switch (this.a) {
            case 0:
                if (i != -1 && (es4Var = ((wl7) this.b).c) != null) {
                    es4Var.setListSelectionHidden(false);
                    break;
                }
                break;
            default:
                ((o0d) this.b).onItemSelected(i);
                break;
        }
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView adapterView) {
        int i = this.a;
    }
}
