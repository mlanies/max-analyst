package defpackage;

/* loaded from: classes2.dex */
public final class it8 {
    public final je7 a;
    public final je7 b;

    public it8(je7 je7Var, je7 je7Var2) {
        this.a = je7Var;
        this.b = je7Var2;
    }

    public final void a(long j, int i, tx8 tx8Var, int i2) {
        String str;
        ad adVar = (ad) this.a.getValue();
        kpa kpaVar = new kpa("message_id", Long.valueOf(j));
        int i3 = 1;
        if (i != 1) {
            i3 = 2;
            if (i != 2) {
                i3 = 3;
                if (i != 3) {
                    throw null;
                }
            }
        }
        us usVarF = br7.f(kpaVar, new kpa("element_type", Integer.valueOf(i3)), new kpa("source_id", Long.valueOf(tx8Var.a)), new kpa("source_type", Integer.valueOf(tx8Var.b)));
        e47 e47Var = new e47();
        e47Var.a = System.currentTimeMillis();
        e47Var.c = "MESSAGE_CLICKABLE_ELEMENT_ACTIONS";
        if (i2 == 1) {
            str = "clicked_clickable_element";
        } else if (i2 == 2) {
            str = "clicked_copy";
        } else if (i2 == 3) {
            str = "clicked_open_link";
        } else if (i2 == 4) {
            str = "clicked_open_mail";
        } else {
            if (i2 != 5) {
                throw null;
            }
            str = "clicked_call";
        }
        e47Var.o = str;
        je7 je7Var = this.b;
        e47Var.b = ((hyc) ((q33) je7Var.getValue())).t();
        e47Var.b(usVarF);
        e47Var.X = ((t33) ((q33) je7Var.getValue())).F();
        adVar.j(e47Var.c());
    }
}
