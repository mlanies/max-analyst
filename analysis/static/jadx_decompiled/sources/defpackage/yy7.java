package defpackage;

import java.util.List;
import one.me.messages.list.loader.MessageModel;

/* loaded from: classes2.dex */
public final class yy7 {
    public e52 a;
    public int b;
    public cu8 c;
    public MessageModel d;
    public u6b e;
    public List f = nz4.a;

    public final zy7 a(m56 m56Var) {
        m56Var.invoke(this);
        e52 e52Var = this.a;
        if (e52Var == null) {
            throw new IllegalArgumentException("Required value was null.".toString());
        }
        int i = this.b;
        u6b u6bVar = this.e;
        if (u6bVar == null) {
            throw new IllegalArgumentException("Required value was null.".toString());
        }
        zy7 zy7Var = new zy7(e52Var, u6bVar, i);
        cu8 cu8Var = this.c;
        if (cu8Var != null) {
            bc7 bc7Var = zy7.h[0];
            zy7Var.d.b = cu8Var;
        }
        MessageModel messageModel = this.d;
        if (messageModel != null) {
            bc7 bc7Var2 = zy7.h[1];
            zy7Var.e.b = messageModel;
        }
        List list = this.f;
        bc7 bc7Var3 = zy7.h[3];
        zy7Var.g.b = list;
        return zy7Var;
    }
}
