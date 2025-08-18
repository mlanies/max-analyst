package scout.exception;

import defpackage.ruc;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lscout/exception/ObjectNullabilityException;", "Lscout/exception/ScoutException;", "core"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class ObjectNullabilityException extends ScoutException {
    public final Class a;
    public final ruc b;
    public final Throwable c;

    public ObjectNullabilityException(Class cls, ruc rucVar) {
        super(0);
        this.a = cls;
        this.b = rucVar;
        this.c = null;
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return this.c;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        StringBuilder sb = new StringBuilder("Expected non-nullable value for ");
        sb.append("Object(type=" + this.a.getName() + ')');
        sb.append(" but scope ");
        sb.append(this.b);
        sb.append(" defines null value");
        return sb.toString();
    }
}
