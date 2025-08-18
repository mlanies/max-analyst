package one.me.sdk.arch.internal;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, d2 = {"Lone/me/sdk/arch/internal/BinderNotFoundValueException;", "Ljava/lang/IllegalStateException;", "Lkotlin/IllegalStateException;", "arch_release"}, k = 1, mv = {2, 0, 0})
/* loaded from: classes2.dex */
public final class BinderNotFoundValueException extends IllegalStateException {
    public BinderNotFoundValueException() {
        this(null, 3);
    }

    public BinderNotFoundValueException(Throwable th, int i) {
        super("could not extract value", (i & 2) != 0 ? null : th);
    }
}
