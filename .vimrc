syntax on
filetype plugin indent on
colorscheme vividchalk
au BufNewFile,BufRead *.clj set ft=clojure

runtime! autoload/pathogen.vim
if exists("g:loaded_pathogen")
  call pathogen#runtime_append_all_bundles()
end

if (has('gui_running'))
  set guifont=Monaco:h16
  set guioptions-=T
  set columns=120
  set lines=70
  set number
endif

autocmd FileType ruby runtime ruby_mappings.vim

map <silent> <LocalLeader>nt :NERDTreeToggle<CR>
map <silent> <LocalLeader>nr :NERDTree<CR>

map <silent> <LocalLeader>nh :nohls<CR>

set vb
