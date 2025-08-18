package scout.exception;

import defpackage.n71;
import defpackage.x53;
import java.util.Collection;
import java.util.Set;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lscout/exception/IllegalOverridesException;", "Lscout/exception/ScoutException;", "core"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class IllegalOverridesException extends ScoutException {
    public final String a;
    public final Throwable b;
    public final Set c;

    public IllegalOverridesException(String str, Collection collection) {
        super(0);
        this.a = str;
        this.b = null;
        this.c = x53.H0(collection);
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return this.b;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        Set set = this.c;
        int size = set.size();
        String str = this.a;
        if (size != 1) {
            String strLineSeparator = System.lineSeparator();
            StringBuilder sb = new StringBuilder("Multiple object factories already exist in ");
            sb.append("Scope(name=\"" + str + "\")");
            sb.append(" and overrides are not allowed:");
            sb.append(System.lineSeparator());
            return x53.n0(this.c, strLineSeparator, sb.toString(), null, n71.Y, 28);
        }
        StringBuilder sb2 = new StringBuilder("Object factory for ");
        sb2.append("Object(type=" + ((Class) x53.f0(set)).getName() + ')');
        sb2.append(" already exist in ");
        sb2.append("Scope(name=\"" + str + "\")");
        sb2.append(" and override is not allowed");
        return sb2.toString();
    }
}
