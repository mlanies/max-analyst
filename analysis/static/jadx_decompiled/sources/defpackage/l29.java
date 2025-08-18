package defpackage;

import java.util.ArrayList;
import java.util.List;
import one.me.messages.list.loader.MessageModel;

/* loaded from: classes2.dex */
public final class l29 implements q29 {
    public static final l29 o = new l29(nz4.a, true, true);
    public final List a;
    public final boolean b;
    public final boolean c;

    public l29(List list, boolean z, boolean z2) {
        this.a = list;
        this.b = z;
        this.c = z2;
    }

    public static String a(MessageModel messageModel) {
        if (messageModel == null) {
            return "null";
        }
        StringBuilder sb = new StringBuilder("MessageModel(messageId=");
        sb.append(messageModel.a);
        sb.append(", serverId=");
        sb.append(messageModel.b);
        sb.append(", sortTime=");
        return zr6.k(sb, messageModel.c, ")");
    }

    @Override // defpackage.q29
    public final List b() {
        return this.a;
    }

    public final ArrayList c() {
        ArrayList arrayList = new ArrayList();
        for (Object obj : this.a) {
            if (((MessageModel) obj).Z == zof.Y) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l29)) {
            return false;
        }
        l29 l29Var = (l29) obj;
        return tpa.f(this.a, l29Var.a) && this.b == l29Var.b && this.c == l29Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + ms2.d(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        List list = this.a;
        return x9e.b0("\n        MessagesList(\n            hasNext=" + this.b + ",\n            hasPrev=" + this.c + ",\n            messages=Messages(size=" + list.size() + ", first=" + a((MessageModel) x53.i0(list)) + ", last=" + a((MessageModel) x53.q0(list)) + ")\n        ) \n        ");
    }
}
