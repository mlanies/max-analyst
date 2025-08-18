package defpackage;

import android.app.PendingIntent;
import android.app.SearchableInfo;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.ImageSpan;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.SearchView$SearchAutoComplete;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public abstract class o0d extends sh7 implements r53 {
    static final boolean DBG = false;
    private static final String IME_OPTION_NO_MICROPHONE = "nm";
    static final String LOG_TAG = "SearchView";
    static final l0d PRE_API_29_HIDDEN_METHOD_INVOKER = null;
    private Bundle mAppSearchData;
    private boolean mClearingFocus;
    final ImageView mCloseButton;
    private final ImageView mCollapsedIcon;
    private int mCollapsedImeOptions;
    private final CharSequence mDefaultQueryHint;
    private final View mDropDownAnchor;
    private boolean mExpandedInActionView;
    final ImageView mGoButton;
    private boolean mIconified;
    private boolean mIconifiedByDefault;
    private int mMaxWidth;
    private CharSequence mOldQueryText;
    private final View.OnClickListener mOnClickListener;
    private i0d mOnCloseListener;
    private final TextView.OnEditorActionListener mOnEditorActionListener;
    private final AdapterView.OnItemClickListener mOnItemClickListener;
    private final AdapterView.OnItemSelectedListener mOnItemSelectedListener;
    private j0d mOnQueryChangeListener;
    View.OnFocusChangeListener mOnQueryTextFocusChangeListener;
    private View.OnClickListener mOnSearchClickListener;
    private k0d mOnSuggestionListener;
    private final WeakHashMap<String, Drawable.ConstantState> mOutsideDrawablesCache;
    private CharSequence mQueryHint;
    private boolean mQueryRefinement;
    private Runnable mReleaseCursorRunnable;
    final ImageView mSearchButton;
    private final View mSearchEditFrame;
    private final Drawable mSearchHintIcon;
    private final View mSearchPlate;
    final SearchView$SearchAutoComplete mSearchSrcTextView;
    private Rect mSearchSrcTextViewBounds;
    private Rect mSearchSrtTextViewBoundsExpanded;
    SearchableInfo mSearchable;
    private final View mSubmitArea;
    private boolean mSubmitButtonEnabled;
    private final int mSuggestionCommitIconResId;
    private final int mSuggestionRowLayout;
    h04 mSuggestionsAdapter;
    private int[] mTemp;
    private int[] mTemp2;
    View.OnKeyListener mTextKeyListener;
    private TextWatcher mTextWatcher;
    private n0d mTouchDelegate;
    private final Runnable mUpdateDrawableStateRunnable;
    private CharSequence mUserQuery;
    private final Intent mVoiceAppSearchIntent;
    final ImageView mVoiceButton;
    private boolean mVoiceButtonEnabled;
    private final Intent mVoiceWebSearchIntent;

    public o0d(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, vsb.searchViewStyle);
    }

    private int getPreferredHeight() {
        return getContext().getResources().getDimensionPixelSize(xtb.abc_search_view_preferred_height);
    }

    private int getPreferredWidth() {
        return getContext().getResources().getDimensionPixelSize(xtb.abc_search_view_preferred_width);
    }

    public static boolean isLandscapeMode(Context context) {
        return context.getResources().getConfiguration().orientation == 2;
    }

    public void adjustDropDownSizeAndPosition() {
        if (this.mDropDownAnchor.getWidth() > 1) {
            Resources resources = getContext().getResources();
            int paddingLeft = this.mSearchPlate.getPaddingLeft();
            Rect rect = new Rect();
            boolean z = getLayoutDirection() == 1;
            int dimensionPixelSize = this.mIconifiedByDefault ? resources.getDimensionPixelSize(xtb.abc_dropdownitem_text_padding_left) + resources.getDimensionPixelSize(xtb.abc_dropdownitem_icon_width) : 0;
            this.mSearchSrcTextView.getDropDownBackground().getPadding(rect);
            this.mSearchSrcTextView.setDropDownHorizontalOffset(z ? -rect.left : paddingLeft - (rect.left + dimensionPixelSize));
            this.mSearchSrcTextView.setDropDownWidth((((this.mDropDownAnchor.getWidth() + rect.left) + rect.right) + dimensionPixelSize) - paddingLeft);
        }
    }

    public final Intent c(String str, Uri uri, String str2, String str3, int i, String str4) {
        Intent intent = new Intent(str);
        intent.addFlags(268435456);
        if (uri != null) {
            intent.setData(uri);
        }
        intent.putExtra("user_query", this.mUserQuery);
        if (str3 != null) {
            intent.putExtra("query", str3);
        }
        if (str2 != null) {
            intent.putExtra("intent_extra_data_key", str2);
        }
        Bundle bundle = this.mAppSearchData;
        if (bundle != null) {
            intent.putExtra("app_data", bundle);
        }
        if (i != 0) {
            intent.putExtra("action_key", i);
            intent.putExtra("action_msg", str4);
        }
        intent.setComponent(this.mSearchable.getSearchActivity());
        return intent;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void clearFocus() {
        this.mClearingFocus = true;
        super.clearFocus();
        this.mSearchSrcTextView.clearFocus();
        this.mSearchSrcTextView.setImeVisibility(false);
        this.mClearingFocus = false;
    }

    public final Intent e(Intent intent, SearchableInfo searchableInfo) {
        ComponentName searchActivity = searchableInfo.getSearchActivity();
        Intent intent2 = new Intent("android.intent.action.SEARCH");
        intent2.setComponent(searchActivity);
        PendingIntent activity = PendingIntent.getActivity(getContext(), 0, intent2, 1107296256);
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.mAppSearchData;
        if (bundle2 != null) {
            bundle.putParcelable("app_data", bundle2);
        }
        Intent intent3 = new Intent(intent);
        Resources resources = getResources();
        String string = searchableInfo.getVoiceLanguageModeId() != 0 ? resources.getString(searchableInfo.getVoiceLanguageModeId()) : "free_form";
        String string2 = searchableInfo.getVoicePromptTextId() != 0 ? resources.getString(searchableInfo.getVoicePromptTextId()) : null;
        String string3 = searchableInfo.getVoiceLanguageId() != 0 ? resources.getString(searchableInfo.getVoiceLanguageId()) : null;
        int voiceMaxResults = searchableInfo.getVoiceMaxResults() != 0 ? searchableInfo.getVoiceMaxResults() : 1;
        intent3.putExtra("android.speech.extra.LANGUAGE_MODEL", string);
        intent3.putExtra("android.speech.extra.PROMPT", string2);
        intent3.putExtra("android.speech.extra.LANGUAGE", string3);
        intent3.putExtra("android.speech.extra.MAX_RESULTS", voiceMaxResults);
        intent3.putExtra("calling_package", searchActivity != null ? searchActivity.flattenToShortString() : null);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT", activity);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT_BUNDLE", bundle);
        return intent3;
    }

    public final void f() {
        boolean z = true;
        boolean z2 = !TextUtils.isEmpty(this.mSearchSrcTextView.getText());
        if (!z2 && (!this.mIconifiedByDefault || this.mExpandedInActionView)) {
            z = false;
        }
        this.mCloseButton.setVisibility(z ? 0 : 8);
        Drawable drawable = this.mCloseButton.getDrawable();
        if (drawable != null) {
            drawable.setState(z2 ? ViewGroup.ENABLED_STATE_SET : ViewGroup.EMPTY_STATE_SET);
        }
    }

    public void forceSuggestionQuery() {
        h0d.a(this.mSearchSrcTextView);
    }

    public final void g() {
        CharSequence queryHint = getQueryHint();
        SearchView$SearchAutoComplete searchView$SearchAutoComplete = this.mSearchSrcTextView;
        if (queryHint == null) {
            queryHint = "";
        }
        if (this.mIconifiedByDefault && this.mSearchHintIcon != null) {
            int textSize = (int) (searchView$SearchAutoComplete.getTextSize() * 1.25d);
            this.mSearchHintIcon.setBounds(0, 0, textSize, textSize);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("   ");
            spannableStringBuilder.setSpan(new ImageSpan(this.mSearchHintIcon), 1, 2, 33);
            spannableStringBuilder.append(queryHint);
            queryHint = spannableStringBuilder;
        }
        searchView$SearchAutoComplete.setHint(queryHint);
    }

    public int getImeOptions() {
        return this.mSearchSrcTextView.getImeOptions();
    }

    public int getInputType() {
        return this.mSearchSrcTextView.getInputType();
    }

    public int getMaxWidth() {
        return this.mMaxWidth;
    }

    public CharSequence getQuery() {
        return this.mSearchSrcTextView.getText();
    }

    public CharSequence getQueryHint() {
        CharSequence charSequence = this.mQueryHint;
        if (charSequence != null) {
            return charSequence;
        }
        SearchableInfo searchableInfo = this.mSearchable;
        return (searchableInfo == null || searchableInfo.getHintId() == 0) ? this.mDefaultQueryHint : getContext().getText(this.mSearchable.getHintId());
    }

    public int getSuggestionCommitIconResId() {
        return this.mSuggestionCommitIconResId;
    }

    public int getSuggestionRowLayout() {
        return this.mSuggestionRowLayout;
    }

    public h04 getSuggestionsAdapter() {
        return this.mSuggestionsAdapter;
    }

    public final void h() {
        this.mSubmitArea.setVisibility(((this.mSubmitButtonEnabled || this.mVoiceButtonEnabled) && !isIconified() && (this.mGoButton.getVisibility() == 0 || this.mVoiceButton.getVisibility() == 0)) ? 0 : 8);
    }

    public final void i(boolean z) {
        boolean z2 = this.mSubmitButtonEnabled;
        this.mGoButton.setVisibility((!z2 || !(z2 || this.mVoiceButtonEnabled) || isIconified() || !hasFocus() || (!z && this.mVoiceButtonEnabled)) ? 8 : 0);
    }

    public boolean isIconfiedByDefault() {
        return this.mIconifiedByDefault;
    }

    public boolean isIconified() {
        return this.mIconified;
    }

    public boolean isQueryRefinementEnabled() {
        return this.mQueryRefinement;
    }

    public boolean isSubmitButtonEnabled() {
        return this.mSubmitButtonEnabled;
    }

    public final void j(boolean z) {
        this.mIconified = z;
        int i = 8;
        int i2 = z ? 0 : 8;
        boolean zIsEmpty = TextUtils.isEmpty(this.mSearchSrcTextView.getText());
        this.mSearchButton.setVisibility(i2);
        i(!zIsEmpty);
        this.mSearchEditFrame.setVisibility(z ? 8 : 0);
        if (this.mCollapsedIcon.getDrawable() != null && !this.mIconifiedByDefault) {
            i = 0;
        }
        this.mCollapsedIcon.setVisibility(i);
        f();
        k(zIsEmpty);
        h();
    }

    public final void k(boolean z) {
        int i = 8;
        if (this.mVoiceButtonEnabled && !isIconified() && z) {
            this.mGoButton.setVisibility(8);
            i = 0;
        }
        this.mVoiceButton.setVisibility(i);
    }

    public void launchQuerySearch(int i, String str, String str2) {
        getContext().startActivity(c("android.intent.action.SEARCH", null, null, str2, i, str));
    }

    @Override // defpackage.r53
    public void onActionViewCollapsed() {
        setQuery("", false);
        clearFocus();
        j(true);
        this.mSearchSrcTextView.setImeOptions(this.mCollapsedImeOptions);
        this.mExpandedInActionView = false;
    }

    @Override // defpackage.r53
    public void onActionViewExpanded() {
        if (this.mExpandedInActionView) {
            return;
        }
        this.mExpandedInActionView = true;
        int imeOptions = this.mSearchSrcTextView.getImeOptions();
        this.mCollapsedImeOptions = imeOptions;
        this.mSearchSrcTextView.setImeOptions(imeOptions | 33554432);
        this.mSearchSrcTextView.setText("");
        setIconified(false);
    }

    public void onCloseClicked() {
        if (!TextUtils.isEmpty(this.mSearchSrcTextView.getText())) {
            this.mSearchSrcTextView.setText("");
            this.mSearchSrcTextView.requestFocus();
            this.mSearchSrcTextView.setImeVisibility(true);
        } else if (this.mIconifiedByDefault) {
            clearFocus();
            j(true);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        removeCallbacks(this.mUpdateDrawableStateRunnable);
        post(this.mReleaseCursorRunnable);
        super.onDetachedFromWindow();
    }

    public boolean onItemClicked(int i, int i2, String str) {
        String strH;
        Cursor cursor = this.mSuggestionsAdapter.c;
        if (cursor != null && cursor.moveToPosition(i)) {
            Intent intentC = null;
            try {
                try {
                    int i3 = qce.I0;
                    String strH2 = qce.h(cursor, cursor.getColumnIndex("suggest_intent_action"));
                    if (strH2 == null) {
                        strH2 = this.mSearchable.getSuggestIntentAction();
                    }
                    if (strH2 == null) {
                        strH2 = "android.intent.action.SEARCH";
                    }
                    String str2 = strH2;
                    String strH3 = qce.h(cursor, cursor.getColumnIndex("suggest_intent_data"));
                    if (strH3 == null) {
                        strH3 = this.mSearchable.getSuggestIntentData();
                    }
                    if (strH3 != null && (strH = qce.h(cursor, cursor.getColumnIndex("suggest_intent_data_id"))) != null) {
                        strH3 = strH3 + "/" + Uri.encode(strH);
                    }
                    intentC = c(str2, strH3 == null ? null : Uri.parse(strH3), qce.h(cursor, cursor.getColumnIndex("suggest_intent_extra_data")), qce.h(cursor, cursor.getColumnIndex("suggest_intent_query")), 0, null);
                } catch (RuntimeException unused) {
                }
            } catch (RuntimeException unused2) {
                cursor.getPosition();
            }
            if (intentC != null) {
                try {
                    getContext().startActivity(intentC);
                } catch (RuntimeException unused3) {
                    intentC.toString();
                }
            }
        }
        this.mSearchSrcTextView.setImeVisibility(false);
        this.mSearchSrcTextView.dismissDropDown();
        return true;
    }

    public boolean onItemSelected(int i) {
        Editable text = this.mSearchSrcTextView.getText();
        Cursor cursor = this.mSuggestionsAdapter.c;
        if (cursor == null) {
            return true;
        }
        if (!cursor.moveToPosition(i)) {
            setQuery(text);
            return true;
        }
        String strC = this.mSuggestionsAdapter.c(cursor);
        if (strC != null) {
            setQuery(strC);
            return true;
        }
        setQuery(text);
        return true;
    }

    @Override // defpackage.sh7, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z) {
            SearchView$SearchAutoComplete searchView$SearchAutoComplete = this.mSearchSrcTextView;
            Rect rect = this.mSearchSrcTextViewBounds;
            searchView$SearchAutoComplete.getLocationInWindow(this.mTemp);
            getLocationInWindow(this.mTemp2);
            int[] iArr = this.mTemp;
            int i5 = iArr[1];
            int[] iArr2 = this.mTemp2;
            int i6 = i5 - iArr2[1];
            int i7 = iArr[0] - iArr2[0];
            rect.set(i7, i6, searchView$SearchAutoComplete.getWidth() + i7, searchView$SearchAutoComplete.getHeight() + i6);
            Rect rect2 = this.mSearchSrtTextViewBoundsExpanded;
            Rect rect3 = this.mSearchSrcTextViewBounds;
            rect2.set(rect3.left, 0, rect3.right, i4 - i2);
            n0d n0dVar = this.mTouchDelegate;
            if (n0dVar == null) {
                n0d n0dVar2 = new n0d(this.mSearchSrcTextView, this.mSearchSrtTextViewBoundsExpanded, this.mSearchSrcTextViewBounds);
                this.mTouchDelegate = n0dVar2;
                setTouchDelegate(n0dVar2);
                return;
            }
            Rect rect4 = this.mSearchSrtTextViewBoundsExpanded;
            Rect rect5 = this.mSearchSrcTextViewBounds;
            n0dVar.b.set(rect4);
            Rect rect6 = n0dVar.d;
            rect6.set(rect4);
            int i8 = -n0dVar.e;
            rect6.inset(i8, i8);
            n0dVar.c.set(rect5);
        }
    }

    @Override // defpackage.sh7, android.view.View
    public void onMeasure(int i, int i2) {
        int i3;
        if (isIconified()) {
            super.onMeasure(i, i2);
            return;
        }
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode == Integer.MIN_VALUE) {
            int i4 = this.mMaxWidth;
            size = i4 > 0 ? Math.min(i4, size) : Math.min(getPreferredWidth(), size);
        } else if (mode == 0) {
            size = this.mMaxWidth;
            if (size <= 0) {
                size = getPreferredWidth();
            }
        } else if (mode == 1073741824 && (i3 = this.mMaxWidth) > 0) {
            size = Math.min(i3, size);
        }
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        if (mode2 == Integer.MIN_VALUE) {
            size2 = Math.min(getPreferredHeight(), size2);
        } else if (mode2 == 0) {
            size2 = getPreferredHeight();
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
    }

    public void onQueryRefine(CharSequence charSequence) {
        setQuery(charSequence);
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof m0d)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        m0d m0dVar = (m0d) parcelable;
        super.onRestoreInstanceState(m0dVar.a);
        j(m0dVar.c);
        requestLayout();
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        m0d m0dVar = new m0d(super.onSaveInstanceState());
        m0dVar.c = isIconified();
        return m0dVar;
    }

    public void onSearchClicked() {
        j(false);
        this.mSearchSrcTextView.requestFocus();
        this.mSearchSrcTextView.setImeVisibility(true);
        View.OnClickListener onClickListener = this.mOnSearchClickListener;
        if (onClickListener != null) {
            onClickListener.onClick(this);
        }
    }

    public void onSubmitQuery() {
        Editable text = this.mSearchSrcTextView.getText();
        if (text == null || TextUtils.getTrimmedLength(text) <= 0) {
            return;
        }
        if (this.mSearchable != null) {
            launchQuerySearch(0, null, text.toString());
        }
        this.mSearchSrcTextView.setImeVisibility(false);
        this.mSearchSrcTextView.dismissDropDown();
    }

    public boolean onSuggestionsKey(View view, int i, KeyEvent keyEvent) {
        if (this.mSearchable != null && this.mSuggestionsAdapter != null && keyEvent.getAction() == 0 && keyEvent.hasNoModifiers()) {
            if (i == 66 || i == 84 || i == 61) {
                return onItemClicked(this.mSearchSrcTextView.getListSelection(), 0, null);
            }
            if (i == 21 || i == 22) {
                this.mSearchSrcTextView.setSelection(i == 21 ? 0 : this.mSearchSrcTextView.length());
                this.mSearchSrcTextView.setListSelection(0);
                this.mSearchSrcTextView.clearListSelection();
                SearchView$SearchAutoComplete searchView$SearchAutoComplete = this.mSearchSrcTextView;
                searchView$SearchAutoComplete.getClass();
                h0d.b(searchView$SearchAutoComplete, 1);
                if (searchView$SearchAutoComplete.enoughToFilter()) {
                    searchView$SearchAutoComplete.showDropDown();
                }
                return true;
            }
            if (i == 19) {
                this.mSearchSrcTextView.getListSelection();
                return false;
            }
        }
        return false;
    }

    public void onTextChanged(CharSequence charSequence) {
        Editable text = this.mSearchSrcTextView.getText();
        this.mUserQuery = text;
        boolean zIsEmpty = TextUtils.isEmpty(text);
        i(!zIsEmpty);
        k(zIsEmpty);
        f();
        h();
        this.mOldQueryText = charSequence.toString();
    }

    public void onTextFocusChanged() {
        j(isIconified());
        post(this.mUpdateDrawableStateRunnable);
        if (this.mSearchSrcTextView.hasFocus()) {
            forceSuggestionQuery();
        }
    }

    public void onVoiceClicked() {
        SearchableInfo searchableInfo = this.mSearchable;
        if (searchableInfo == null) {
            return;
        }
        try {
            if (!searchableInfo.getVoiceSearchLaunchWebSearch()) {
                if (searchableInfo.getVoiceSearchLaunchRecognizer()) {
                    getContext().startActivity(e(this.mVoiceAppSearchIntent, searchableInfo));
                }
            } else {
                Intent intent = new Intent(this.mVoiceWebSearchIntent);
                ComponentName searchActivity = searchableInfo.getSearchActivity();
                intent.putExtra("calling_package", searchActivity == null ? null : searchActivity.flattenToShortString());
                getContext().startActivity(intent);
            }
        } catch (ActivityNotFoundException unused) {
        }
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        post(this.mUpdateDrawableStateRunnable);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean requestFocus(int i, Rect rect) {
        if (this.mClearingFocus || !isFocusable()) {
            return false;
        }
        if (isIconified()) {
            return super.requestFocus(i, rect);
        }
        boolean zRequestFocus = this.mSearchSrcTextView.requestFocus(i, rect);
        if (zRequestFocus) {
            j(false);
        }
        return zRequestFocus;
    }

    public void setAppSearchData(Bundle bundle) {
        this.mAppSearchData = bundle;
    }

    public void setIconified(boolean z) {
        if (z) {
            onCloseClicked();
        } else {
            onSearchClicked();
        }
    }

    public void setIconifiedByDefault(boolean z) {
        if (this.mIconifiedByDefault == z) {
            return;
        }
        this.mIconifiedByDefault = z;
        j(z);
        g();
    }

    public void setImeOptions(int i) {
        this.mSearchSrcTextView.setImeOptions(i);
    }

    public void setInputType(int i) {
        this.mSearchSrcTextView.setInputType(i);
    }

    public void setMaxWidth(int i) {
        this.mMaxWidth = i;
        requestLayout();
    }

    public void setOnCloseListener(i0d i0dVar) {
    }

    public void setOnQueryTextFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        this.mOnQueryTextFocusChangeListener = onFocusChangeListener;
    }

    public void setOnQueryTextListener(j0d j0dVar) {
    }

    public void setOnSearchClickListener(View.OnClickListener onClickListener) {
        this.mOnSearchClickListener = onClickListener;
    }

    public void setOnSuggestionListener(k0d k0dVar) {
    }

    public void setQuery(CharSequence charSequence, boolean z) {
        this.mSearchSrcTextView.setText(charSequence);
        if (charSequence != null) {
            SearchView$SearchAutoComplete searchView$SearchAutoComplete = this.mSearchSrcTextView;
            searchView$SearchAutoComplete.setSelection(searchView$SearchAutoComplete.length());
            this.mUserQuery = charSequence;
        }
        if (!z || TextUtils.isEmpty(charSequence)) {
            return;
        }
        onSubmitQuery();
    }

    public void setQueryHint(CharSequence charSequence) {
        this.mQueryHint = charSequence;
        g();
    }

    public void setQueryRefinementEnabled(boolean z) {
        this.mQueryRefinement = z;
        h04 h04Var = this.mSuggestionsAdapter;
        if (h04Var instanceof qce) {
            ((qce) h04Var).A0 = z ? 2 : 1;
        }
    }

    public void setSearchableInfo(SearchableInfo searchableInfo) {
        this.mSearchable = searchableInfo;
        Intent intent = null;
        if (searchableInfo != null) {
            this.mSearchSrcTextView.setThreshold(searchableInfo.getSuggestThreshold());
            this.mSearchSrcTextView.setImeOptions(this.mSearchable.getImeOptions());
            int inputType = this.mSearchable.getInputType();
            if ((inputType & 15) == 1) {
                inputType &= -65537;
                if (this.mSearchable.getSuggestAuthority() != null) {
                    inputType |= 589824;
                }
            }
            this.mSearchSrcTextView.setInputType(inputType);
            h04 h04Var = this.mSuggestionsAdapter;
            if (h04Var != null) {
                h04Var.b(null);
            }
            if (this.mSearchable.getSuggestAuthority() != null) {
                qce qceVar = new qce(getContext(), this, this.mSearchable, this.mOutsideDrawablesCache);
                this.mSuggestionsAdapter = qceVar;
                this.mSearchSrcTextView.setAdapter(qceVar);
                ((qce) this.mSuggestionsAdapter).A0 = this.mQueryRefinement ? 2 : 1;
            }
            g();
        }
        SearchableInfo searchableInfo2 = this.mSearchable;
        boolean z = false;
        if (searchableInfo2 != null && searchableInfo2.getVoiceSearchEnabled()) {
            if (this.mSearchable.getVoiceSearchLaunchWebSearch()) {
                intent = this.mVoiceWebSearchIntent;
            } else if (this.mSearchable.getVoiceSearchLaunchRecognizer()) {
                intent = this.mVoiceAppSearchIntent;
            }
            if (intent != null) {
                z = getContext().getPackageManager().resolveActivity(intent, 65536) != null;
            }
        }
        this.mVoiceButtonEnabled = z;
        if (z) {
            this.mSearchSrcTextView.setPrivateImeOptions(IME_OPTION_NO_MICROPHONE);
        }
        j(isIconified());
    }

    public void setSubmitButtonEnabled(boolean z) {
        this.mSubmitButtonEnabled = z;
        j(isIconified());
    }

    public void setSuggestionsAdapter(h04 h04Var) {
        this.mSuggestionsAdapter = h04Var;
        this.mSearchSrcTextView.setAdapter(h04Var);
    }

    public void updateFocusedState() {
        int[] iArr = this.mSearchSrcTextView.hasFocus() ? ViewGroup.FOCUSED_STATE_SET : ViewGroup.EMPTY_STATE_SET;
        Drawable background = this.mSearchPlate.getBackground();
        if (background != null) {
            background.setState(iArr);
        }
        Drawable background2 = this.mSubmitArea.getBackground();
        if (background2 != null) {
            background2.setState(iArr);
        }
        invalidate();
    }

    public o0d(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mSearchSrcTextViewBounds = new Rect();
        this.mSearchSrtTextViewBoundsExpanded = new Rect();
        this.mTemp = new int[2];
        this.mTemp2 = new int[2];
        int i2 = 1;
        this.mUpdateDrawableStateRunnable = new c0d(this, i2);
        int i3 = 0;
        this.mReleaseCursorRunnable = new c0d(this, i3);
        this.mOutsideDrawablesCache = new WeakHashMap<>();
        e0d e0dVar = new e0d(i3, this);
        this.mOnClickListener = e0dVar;
        this.mTextKeyListener = new f0d(this);
        g0d g0dVar = new g0d(this);
        this.mOnEditorActionListener = g0dVar;
        wn wnVar = new wn(2, this);
        this.mOnItemClickListener = wnVar;
        rl7 rl7Var = new rl7(i2, this);
        this.mOnItemSelectedListener = rl7Var;
        this.mTextWatcher = new z2(7, this);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, p3c.SearchView, i, 0);
        k8g k8gVar = new k8g(context, typedArrayObtainStyledAttributes);
        int[] iArr = p3c.SearchView;
        WeakHashMap weakHashMap = zmf.a;
        umf.d(this, context, iArr, attributeSet, typedArrayObtainStyledAttributes, i, 0);
        LayoutInflater.from(context).inflate(typedArrayObtainStyledAttributes.getResourceId(p3c.SearchView_layout, zyb.abc_search_view), (ViewGroup) this, true);
        SearchView$SearchAutoComplete searchView$SearchAutoComplete = (SearchView$SearchAutoComplete) findViewById(mvb.search_src_text);
        this.mSearchSrcTextView = searchView$SearchAutoComplete;
        searchView$SearchAutoComplete.setSearchView(this);
        this.mSearchEditFrame = findViewById(mvb.search_edit_frame);
        View viewFindViewById = findViewById(mvb.search_plate);
        this.mSearchPlate = viewFindViewById;
        View viewFindViewById2 = findViewById(mvb.submit_area);
        this.mSubmitArea = viewFindViewById2;
        ImageView imageView = (ImageView) findViewById(mvb.search_button);
        this.mSearchButton = imageView;
        ImageView imageView2 = (ImageView) findViewById(mvb.search_go_btn);
        this.mGoButton = imageView2;
        ImageView imageView3 = (ImageView) findViewById(mvb.search_close_btn);
        this.mCloseButton = imageView3;
        ImageView imageView4 = (ImageView) findViewById(mvb.search_voice_btn);
        this.mVoiceButton = imageView4;
        ImageView imageView5 = (ImageView) findViewById(mvb.search_mag_icon);
        this.mCollapsedIcon = imageView5;
        viewFindViewById.setBackground(k8gVar.n(p3c.SearchView_queryBackground));
        viewFindViewById2.setBackground(k8gVar.n(p3c.SearchView_submitBackground));
        imageView.setImageDrawable(k8gVar.n(p3c.SearchView_searchIcon));
        imageView2.setImageDrawable(k8gVar.n(p3c.SearchView_goIcon));
        imageView3.setImageDrawable(k8gVar.n(p3c.SearchView_closeIcon));
        imageView4.setImageDrawable(k8gVar.n(p3c.SearchView_voiceIcon));
        imageView5.setImageDrawable(k8gVar.n(p3c.SearchView_searchIcon));
        this.mSearchHintIcon = k8gVar.n(p3c.SearchView_searchHintIcon);
        swe.a(imageView, getResources().getString(i2c.abc_searchview_description_search));
        this.mSuggestionRowLayout = typedArrayObtainStyledAttributes.getResourceId(p3c.SearchView_suggestionRowLayout, zyb.abc_search_dropdown_item_icons_2line);
        this.mSuggestionCommitIconResId = typedArrayObtainStyledAttributes.getResourceId(p3c.SearchView_commitIcon, 0);
        imageView.setOnClickListener(e0dVar);
        imageView3.setOnClickListener(e0dVar);
        imageView2.setOnClickListener(e0dVar);
        imageView4.setOnClickListener(e0dVar);
        searchView$SearchAutoComplete.setOnClickListener(e0dVar);
        searchView$SearchAutoComplete.addTextChangedListener(this.mTextWatcher);
        searchView$SearchAutoComplete.setOnEditorActionListener(g0dVar);
        searchView$SearchAutoComplete.setOnItemClickListener(wnVar);
        searchView$SearchAutoComplete.setOnItemSelectedListener(rl7Var);
        searchView$SearchAutoComplete.setOnKeyListener(this.mTextKeyListener);
        searchView$SearchAutoComplete.setOnFocusChangeListener(new d0d(this));
        setIconifiedByDefault(typedArrayObtainStyledAttributes.getBoolean(p3c.SearchView_iconifiedByDefault, true));
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(p3c.SearchView_android_maxWidth, -1);
        if (dimensionPixelSize != -1) {
            setMaxWidth(dimensionPixelSize);
        }
        this.mDefaultQueryHint = typedArrayObtainStyledAttributes.getText(p3c.SearchView_defaultQueryHint);
        this.mQueryHint = typedArrayObtainStyledAttributes.getText(p3c.SearchView_queryHint);
        int i4 = typedArrayObtainStyledAttributes.getInt(p3c.SearchView_android_imeOptions, -1);
        if (i4 != -1) {
            setImeOptions(i4);
        }
        int i5 = typedArrayObtainStyledAttributes.getInt(p3c.SearchView_android_inputType, -1);
        if (i5 != -1) {
            setInputType(i5);
        }
        setFocusable(typedArrayObtainStyledAttributes.getBoolean(p3c.SearchView_android_focusable, true));
        k8gVar.z();
        Intent intent = new Intent("android.speech.action.WEB_SEARCH");
        this.mVoiceWebSearchIntent = intent;
        intent.addFlags(268435456);
        intent.putExtra("android.speech.extra.LANGUAGE_MODEL", "web_search");
        Intent intent2 = new Intent("android.speech.action.RECOGNIZE_SPEECH");
        this.mVoiceAppSearchIntent = intent2;
        intent2.addFlags(268435456);
        View viewFindViewById3 = findViewById(searchView$SearchAutoComplete.getDropDownAnchor());
        this.mDropDownAnchor = viewFindViewById3;
        if (viewFindViewById3 != null) {
            viewFindViewById3.addOnLayoutChangeListener(new qq0(12, this));
        }
        j(this.mIconifiedByDefault);
        g();
    }

    private void setQuery(CharSequence charSequence) {
        this.mSearchSrcTextView.setText(charSequence);
        this.mSearchSrcTextView.setSelection(TextUtils.isEmpty(charSequence) ? 0 : charSequence.length());
    }
}
