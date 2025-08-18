package defpackage;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public final class n3e {
    public final long a;
    public final String b;
    public final String c;
    public final long d;
    public final long e;
    public final long f;
    public final String g;
    public final List h;
    public final boolean i;
    public final int j;

    public n3e(l3e l3eVar) {
        this.a = l3eVar.a;
        this.b = l3eVar.b;
        this.c = l3eVar.c;
        this.d = l3eVar.d;
        this.e = l3eVar.e;
        this.f = l3eVar.f;
        this.g = l3eVar.h;
        this.h = l3eVar.g;
        this.i = l3eVar.i;
        this.j = l3eVar.j;
    }

    public static n3e a(gy8 gy8Var) {
        int iN = lz7.N(gy8Var);
        if (iN == 0) {
            return null;
        }
        l3e l3eVar = new l3e();
        for (int i = 0; i < iN; i++) {
            String strZ0 = gy8Var.z0();
            strZ0.getClass();
            switch (strZ0) {
                case "updateTime":
                    l3eVar.f = lz7.M(gy8Var, 0L);
                    break;
                case "id":
                    l3eVar.a = gy8Var.w0();
                    break;
                case "link":
                    l3eVar.h = lz7.P(gy8Var);
                    break;
                case "name":
                    l3eVar.b = lz7.P(gy8Var);
                    break;
                case "draft":
                    l3eVar.i = lz7.H(gy8Var);
                    break;
                case "createTime":
                    l3eVar.e = lz7.M(gy8Var, 0L);
                    break;
                case "authorId":
                    l3eVar.d = lz7.M(gy8Var, 0L);
                    break;
                case "stickers":
                    int iG = lz7.G(gy8Var);
                    ArrayList arrayList = new ArrayList(iG);
                    for (int i2 = 0; i2 < iG; i2++) {
                        arrayList.add(Long.valueOf(gy8Var.w0()));
                    }
                    l3eVar.g = arrayList;
                    break;
                case "iconUrl":
                    l3eVar.c = lz7.P(gy8Var);
                    break;
                case "installCount":
                    l3eVar.j = lz7.L(gy8Var);
                    break;
                default:
                    gy8Var.z();
                    break;
            }
        }
        return new n3e(l3eVar);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StickerSet{id=");
        sb.append(this.a);
        sb.append(", name='");
        sb.append(this.b);
        sb.append("', iconUrl='");
        sb.append(this.c);
        sb.append("', authorId=");
        sb.append(this.d);
        sb.append(", createTime=");
        sb.append(this.e);
        sb.append(", updateTime=");
        sb.append(this.f);
        sb.append(", link='");
        sb.append(this.g);
        sb.append("', stickers=");
        sb.append(this.h);
        sb.append(", draft=");
        sb.append(this.i);
        sb.append(", installCount=");
        return zr6.j(sb, this.j, "}");
    }
}
