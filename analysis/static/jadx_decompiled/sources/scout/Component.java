package scout;

import defpackage.fpb;
import defpackage.je7;
import defpackage.ruc;
import defpackage.tpa;
import defpackage.v4;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\b\b\n\u0002\u0010$\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\b&\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001c\u0010\u0007\u001a\u00028\u0000\"\n\b\u0000\u0010\u0006\u0018\u0001*\u00020\u0001H\u0084\b¢\u0006\u0004\b\u0007\u0010\bJ\"\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\t\"\n\b\u0000\u0010\u0006\u0018\u0001*\u00020\u0001H\u0084\b¢\u0006\u0004\b\n\u0010\u000bJ\"\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\f\"\n\b\u0000\u0010\u0006\u0018\u0001*\u00020\u0001H\u0084\b¢\u0006\u0004\b\r\u0010\u000eJ\u001e\u0010\u000f\u001a\u0004\u0018\u00018\u0000\"\n\b\u0000\u0010\u0006\u0018\u0001*\u00020\u0001H\u0084\b¢\u0006\u0004\b\u000f\u0010\bJ$\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\t\"\n\b\u0000\u0010\u0006\u0018\u0001*\u00020\u0001H\u0084\b¢\u0006\u0004\b\u0010\u0010\u000bJ$\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\f\"\n\b\u0000\u0010\u0006\u0018\u0001*\u00020\u0001H\u0084\b¢\u0006\u0004\b\u0011\u0010\u000eJ,\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u0014\"\n\b\u0000\u0010\u0006\u0018\u0001*\u00020\u00012\b\b\u0002\u0010\u0013\u001a\u00020\u0012H\u0084\b¢\u0006\u0004\b\u0015\u0010\u0016J2\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00140\t\"\n\b\u0000\u0010\u0006\u0018\u0001*\u00020\u00012\b\b\u0002\u0010\u0013\u001a\u00020\u0012H\u0084\b¢\u0006\u0004\b\u0017\u0010\u0018J2\u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00140\f\"\n\b\u0000\u0010\u0006\u0018\u0001*\u00020\u00012\b\b\u0002\u0010\u0013\u001a\u00020\u0012H\u0084\b¢\u0006\u0004\b\u0019\u0010\u001aJ>\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u001d\"\n\b\u0000\u0010\u001b\u0018\u0001*\u00020\u0001\"\n\b\u0001\u0010\u001c\u0018\u0001*\u00020\u00012\b\b\u0002\u0010\u0013\u001a\u00020\u0012H\u0084\b¢\u0006\u0004\b\u001e\u0010\u001fJD\u0010 \u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u001d0\t\"\n\b\u0000\u0010\u001b\u0018\u0001*\u00020\u0001\"\n\b\u0001\u0010\u001c\u0018\u0001*\u00020\u00012\b\b\u0002\u0010\u0013\u001a\u00020\u0012H\u0084\b¢\u0006\u0004\b \u0010\u0018JD\u0010!\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u001d0\f\"\n\b\u0000\u0010\u001b\u0018\u0001*\u00020\u0001\"\n\b\u0001\u0010\u001c\u0018\u0001*\u00020\u00012\b\b\u0002\u0010\u0013\u001a\u00020\u0012H\u0084\b¢\u0006\u0004\b!\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\"\u001a\u0004\b#\u0010$R \u0010&\u001a\u00020%8\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b&\u0010'\u0012\u0004\b*\u0010+\u001a\u0004\b(\u0010)¨\u0006,"}, d2 = {"Lscout/Component;", "", "Lruc;", "scope", "<init>", "(Lruc;)V", "T", "get", "()Ljava/lang/Object;", "Lje7;", "getLazy", "()Lje7;", "Lfpb;", "getProvider", "()Lfpb;", "opt", "optLazy", "optProvider", "", "nonEmpty", "", "collect", "(Z)Ljava/util/List;", "collectLazy", "(Z)Lje7;", "collectProvider", "(Z)Lfpb;", "K", "V", "", "associate", "(Z)Ljava/util/Map;", "associateLazy", "associateProvider", "Lruc;", "getScope", "()Lruc;", "Lv4;", "accessor", "Lv4;", "getAccessor", "()Lv4;", "getAccessor$annotations", "()V", "core"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public abstract class Component {
    private final v4 accessor;
    private final ruc scope;

    public Component(ruc rucVar) {
        this.scope = rucVar;
        this.accessor = rucVar.g;
    }

    public static Map associate$default(Component component, boolean z, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: associate");
        }
        component.getAccessor();
        tpa.F();
        throw null;
    }

    public static je7 associateLazy$default(Component component, boolean z, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: associateLazy");
        }
        component.getAccessor();
        tpa.F();
        throw null;
    }

    public static fpb associateProvider$default(Component component, boolean z, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: associateProvider");
        }
        component.getAccessor();
        tpa.F();
        throw null;
    }

    public static List collect$default(Component component, boolean z, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: collect");
        }
        component.getAccessor();
        tpa.F();
        throw null;
    }

    public static je7 collectLazy$default(Component component, boolean z, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: collectLazy");
        }
        component.getAccessor();
        tpa.F();
        throw null;
    }

    public static fpb collectProvider$default(Component component, boolean z, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: collectProvider");
        }
        component.getAccessor();
        tpa.F();
        throw null;
    }

    public static /* synthetic */ void getAccessor$annotations() {
    }

    public final <K, V> Map<K, V> associate(boolean nonEmpty) {
        getAccessor();
        tpa.F();
        throw null;
    }

    public final <K, V> je7 associateLazy(boolean nonEmpty) {
        getAccessor();
        tpa.F();
        throw null;
    }

    public final <K, V> fpb associateProvider(boolean nonEmpty) {
        getAccessor();
        tpa.F();
        throw null;
    }

    public final <T> List<T> collect(boolean nonEmpty) {
        getAccessor();
        tpa.F();
        throw null;
    }

    public final <T> je7 collectLazy(boolean nonEmpty) {
        getAccessor();
        tpa.F();
        throw null;
    }

    public final <T> fpb collectProvider(boolean nonEmpty) {
        getAccessor();
        tpa.F();
        throw null;
    }

    public final <T> T get() {
        getAccessor();
        tpa.F();
        throw null;
    }

    public final v4 getAccessor() {
        return this.accessor;
    }

    public final <T> je7 getLazy() {
        getAccessor();
        tpa.F();
        throw null;
    }

    public final <T> fpb getProvider() {
        getAccessor();
        tpa.F();
        throw null;
    }

    public final ruc getScope() {
        return this.scope;
    }

    public final <T> T opt() {
        getAccessor();
        tpa.F();
        throw null;
    }

    public final <T> je7 optLazy() {
        getAccessor();
        tpa.F();
        throw null;
    }

    public final <T> fpb optProvider() {
        getAccessor();
        tpa.F();
        throw null;
    }
}
