package defpackage;

/* loaded from: classes.dex */
public final class la7 {
    public final boolean a = false;
    public final boolean b = false;
    public final boolean c = false;
    public final boolean d = false;
    public final boolean e = false;
    public final boolean f = true;
    public final String g = "    ";
    public final boolean h = false;
    public final boolean i = false;
    public final String j = "type";
    public final boolean k = false;
    public final boolean l = true;
    public final boolean m = false;
    public final boolean n = false;
    public final boolean o = false;
    public final int p = 3;

    public final String toString() {
        StringBuilder sb = new StringBuilder("JsonConfiguration(encodeDefaults=");
        sb.append(this.a);
        sb.append(", ignoreUnknownKeys=");
        sb.append(this.b);
        sb.append(", isLenient=");
        sb.append(this.c);
        sb.append(", allowStructuredMapKeys=");
        sb.append(this.d);
        sb.append(", prettyPrint=");
        sb.append(this.e);
        sb.append(", explicitNulls=");
        sb.append(this.f);
        sb.append(", prettyPrintIndent='");
        sb.append(this.g);
        sb.append("', coerceInputValues=");
        sb.append(this.h);
        sb.append(", useArrayPolymorphism=");
        sb.append(this.i);
        sb.append(", classDiscriminator='");
        sb.append(this.j);
        sb.append("', allowSpecialFloatingPointValues=");
        sb.append(this.k);
        sb.append(", useAlternativeNames=");
        sb.append(this.l);
        sb.append(", namingStrategy=null, decodeEnumsCaseInsensitive=");
        sb.append(this.m);
        sb.append(", allowTrailingComma=");
        sb.append(this.n);
        sb.append(", allowComments=");
        sb.append(this.o);
        sb.append(", classDiscriminatorMode=");
        int i = this.p;
        sb.append(i != 1 ? i != 2 ? i != 3 ? "null" : "POLYMORPHIC" : "ALL_JSON_OBJECTS" : "NONE");
        sb.append(')');
        return sb.toString();
    }
}
