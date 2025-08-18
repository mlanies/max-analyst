package defpackage;

import android.view.View;

/* loaded from: classes2.dex */
public final /* synthetic */ class z52 implements View.OnLongClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object o;

    public /* synthetic */ z52(Object obj, Object obj2, Object obj3, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.o = obj3;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        a66 a66Var;
        switch (this.a) {
            case 0:
                ((a66) this.b).invoke((qm8) this.c, ((a62) this.o).a);
                break;
            case 1:
                ((a66) this.b).invoke((um8) this.c, ((na2) this.o).a);
                break;
            case 2:
                ((a66) this.b).invoke((wm8) this.c, ((a62) this.o).a);
                break;
            case 3:
                ((a66) this.b).invoke((vq2) this.c, (m62) this.o);
                break;
            case 4:
                ((a66) this.b).invoke(Long.valueOf(((nl2) this.c).a), ((us2) this.o).a);
                break;
            case 5:
                ((a66) this.b).invoke((jq3) this.c, (lk3) this.o);
                break;
            case 6:
                ((a66) this.b).invoke(Long.valueOf(((fb5) this.c).a), ((db5) this.o).a);
                break;
            case 7:
                ((a66) this.b).invoke(Long.valueOf(((fb5) this.c).a), ((hb5) this.o).a);
                break;
            case 8:
                x30 x30Var = (x30) this.b;
                m56 m56Var = (m56) x30Var.Y;
                if (m56Var != null) {
                    boolean zBooleanValue = ((Boolean) m56Var.invoke(((vja) this.c).getTabItem())).booleanValue();
                    if (zBooleanValue && (a66Var = (a66) x30Var.Z) != null) {
                        a66Var.invoke(view, (y5a) this.o);
                        break;
                    }
                }
                break;
            default:
                ((a66) this.b).invoke((od6) this.c, (m62) this.o);
                break;
        }
        return true;
    }
}
