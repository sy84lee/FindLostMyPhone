// Generated by view binder compiler. Do not edit!
package com.sy.publicapiviewer.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.textfield.TextInputEditText;
import com.sy.publicapiviewer.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentDetailBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final ImageView imageView;

  @NonNull
  public final TextInputEditText textInputEditTextActId;

  @NonNull
  public final TextInputEditText textInputEditTextClrNm;

  @NonNull
  public final TextInputEditText textInputEditTextDepPlace;

  @NonNull
  public final TextInputEditText textInputEditTextFdPrdtNm;

  @NonNull
  public final TextInputEditText textInputEditTextFdSn;

  @NonNull
  public final TextInputEditText textInputEditTextFdYmd;

  @NonNull
  public final TextInputEditText textInputEditTextMdcd;

  @NonNull
  public final TextInputEditText textInputEditTextPrdtCINm;

  @NonNull
  public final TextInputEditText textInputEditTextRnum;

  @NonNull
  public final TextInputEditText textInputEditTextSrno;

  private FragmentDetailBinding(@NonNull ConstraintLayout rootView, @NonNull ImageView imageView,
      @NonNull TextInputEditText textInputEditTextActId,
      @NonNull TextInputEditText textInputEditTextClrNm,
      @NonNull TextInputEditText textInputEditTextDepPlace,
      @NonNull TextInputEditText textInputEditTextFdPrdtNm,
      @NonNull TextInputEditText textInputEditTextFdSn,
      @NonNull TextInputEditText textInputEditTextFdYmd,
      @NonNull TextInputEditText textInputEditTextMdcd,
      @NonNull TextInputEditText textInputEditTextPrdtCINm,
      @NonNull TextInputEditText textInputEditTextRnum,
      @NonNull TextInputEditText textInputEditTextSrno) {
    this.rootView = rootView;
    this.imageView = imageView;
    this.textInputEditTextActId = textInputEditTextActId;
    this.textInputEditTextClrNm = textInputEditTextClrNm;
    this.textInputEditTextDepPlace = textInputEditTextDepPlace;
    this.textInputEditTextFdPrdtNm = textInputEditTextFdPrdtNm;
    this.textInputEditTextFdSn = textInputEditTextFdSn;
    this.textInputEditTextFdYmd = textInputEditTextFdYmd;
    this.textInputEditTextMdcd = textInputEditTextMdcd;
    this.textInputEditTextPrdtCINm = textInputEditTextPrdtCINm;
    this.textInputEditTextRnum = textInputEditTextRnum;
    this.textInputEditTextSrno = textInputEditTextSrno;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentDetailBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentDetailBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_detail, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentDetailBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.imageView;
      ImageView imageView = ViewBindings.findChildViewById(rootView, id);
      if (imageView == null) {
        break missingId;
      }

      id = R.id.textInputEditTextActId;
      TextInputEditText textInputEditTextActId = ViewBindings.findChildViewById(rootView, id);
      if (textInputEditTextActId == null) {
        break missingId;
      }

      id = R.id.textInputEditTextClrNm;
      TextInputEditText textInputEditTextClrNm = ViewBindings.findChildViewById(rootView, id);
      if (textInputEditTextClrNm == null) {
        break missingId;
      }

      id = R.id.textInputEditTextDepPlace;
      TextInputEditText textInputEditTextDepPlace = ViewBindings.findChildViewById(rootView, id);
      if (textInputEditTextDepPlace == null) {
        break missingId;
      }

      id = R.id.textInputEditTextFdPrdtNm;
      TextInputEditText textInputEditTextFdPrdtNm = ViewBindings.findChildViewById(rootView, id);
      if (textInputEditTextFdPrdtNm == null) {
        break missingId;
      }

      id = R.id.textInputEditTextFdSn;
      TextInputEditText textInputEditTextFdSn = ViewBindings.findChildViewById(rootView, id);
      if (textInputEditTextFdSn == null) {
        break missingId;
      }

      id = R.id.textInputEditTextFdYmd;
      TextInputEditText textInputEditTextFdYmd = ViewBindings.findChildViewById(rootView, id);
      if (textInputEditTextFdYmd == null) {
        break missingId;
      }

      id = R.id.textInputEditTextMdcd;
      TextInputEditText textInputEditTextMdcd = ViewBindings.findChildViewById(rootView, id);
      if (textInputEditTextMdcd == null) {
        break missingId;
      }

      id = R.id.textInputEditTextPrdtCINm;
      TextInputEditText textInputEditTextPrdtCINm = ViewBindings.findChildViewById(rootView, id);
      if (textInputEditTextPrdtCINm == null) {
        break missingId;
      }

      id = R.id.textInputEditTextRnum;
      TextInputEditText textInputEditTextRnum = ViewBindings.findChildViewById(rootView, id);
      if (textInputEditTextRnum == null) {
        break missingId;
      }

      id = R.id.textInputEditTextSrno;
      TextInputEditText textInputEditTextSrno = ViewBindings.findChildViewById(rootView, id);
      if (textInputEditTextSrno == null) {
        break missingId;
      }

      return new FragmentDetailBinding((ConstraintLayout) rootView, imageView,
          textInputEditTextActId, textInputEditTextClrNm, textInputEditTextDepPlace,
          textInputEditTextFdPrdtNm, textInputEditTextFdSn, textInputEditTextFdYmd,
          textInputEditTextMdcd, textInputEditTextPrdtCINm, textInputEditTextRnum,
          textInputEditTextSrno);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
