package kotlinx.coroutines.internal;

import defpackage.m56;
import kotlin.Metadata;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;

@Metadata(d1 = {"\u0000)\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0004*\u0001\u000b\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J1\u0010\t\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0007j\u0002`\b2\u000e\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u0004H\u0016¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lkotlinx/coroutines/internal/ClassValueCtorCache;", "Lkotlinx/coroutines/internal/CtorCache;", "<init>", "()V", "Ljava/lang/Class;", "", "key", "Lkotlin/Function1;", "Lkotlinx/coroutines/internal/Ctor;", "get", "(Ljava/lang/Class;)Lm56;", "kotlinx/coroutines/internal/ClassValueCtorCache$cache$1", "cache", "Lkotlinx/coroutines/internal/ClassValueCtorCache$cache$1;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 0, 0})
@IgnoreJRERequirement
/* loaded from: classes.dex */
final class ClassValueCtorCache extends CtorCache {
    public static final ClassValueCtorCache INSTANCE = new ClassValueCtorCache();
    private static final ClassValueCtorCache$cache$1 cache = new ClassValue<m56>() { // from class: kotlinx.coroutines.internal.ClassValueCtorCache$cache$1
        @Override // java.lang.ClassValue
        public /* bridge */ /* synthetic */ m56 computeValue(Class cls) {
            return computeValue2((Class<?>) cls);
        }

        @Override // java.lang.ClassValue
        /* renamed from: computeValue, reason: avoid collision after fix types in other method */
        public m56 computeValue2(Class<?> type) {
            return ExceptionsConstructorKt.createConstructor(type);
        }
    };

    private ClassValueCtorCache() {
    }

    @Override // kotlinx.coroutines.internal.CtorCache
    public m56 get(Class<? extends Throwable> key) {
        return (m56) cache.get(key);
    }
}
