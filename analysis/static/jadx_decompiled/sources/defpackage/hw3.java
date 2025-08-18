package defpackage;

/* loaded from: classes2.dex */
public final class hw3 implements gw3 {
    public String a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hw3) && tpa.f(this.a, ((hw3) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return zr6.i("ConversationIdProviderImpl(conversationId=", this.a, ")");
    }
}
