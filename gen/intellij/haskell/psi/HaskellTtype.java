// This is a generated file. Not intended for manual editing.
package intellij.haskell.psi;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public interface HaskellTtype extends HaskellCompositeElement {

  @Nullable
  HaskellListType getListType();

  @NotNull
  List<HaskellQName> getQNameList();

  @NotNull
  List<HaskellTtype> getTtypeList();

  @NotNull
  List<HaskellTypeSignature> getTypeSignatureList();

  @Nullable
  HaskellVarsym getVarsym();

}
