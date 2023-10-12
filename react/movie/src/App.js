import {BrowserRouter, Routes, Route, Link} from 'react-router-dom'
import React from 'react'
import {useState} from 'react'
import {useLocation} from 'react-router-dom'
import {useNavigate} from 'react-router-dom'

function App() {
  let [list, setList] = useState([{
    id : 1,
    title : 'Movie 1',
    genre : 'Drama',
    release_date : '2022-01-01',
  },{
    id : 2,
    title : 'Movie 2',
    genre : 'Action',
    release_date : '2022-02-01',
  },{
    id : 3,
    title : 'Movie 3',
    genre : 'Comedy',
    release_date : '2022-03-01',
  }]);
  const deleteBoard = (id)=>{
    let tmpList = list.filter(item=>item.id != id);
    setList(tmpList);
  }
  const addBoard = (board)=>{
    setList([...list, board]);
  }
  return (
    <BrowserRouter>   
      <Header/>
      <Routes>
        <Route path="/" exact element={<Home list={list} deleteBoard={deleteBoard} add={addBoard} />} />
        <Route path="/insert" element={<Insert list={list} add={addBoard} />} />
      </Routes>
    </BrowserRouter>
  );
}

function Header(){
	return(
		<header className='menu'>
			<ul className='menu-list'>
				<li className='menu-item'>
					<Link to="/" className='menu-link'>List</Link>
				</li>
				<li className='menu-item'>
					<Link to="/insert" className='menu-link'>Add New Movie</Link>
				</li>
			</ul>
		</header>
	)
}

function Home({list, deleteBoard, add}){
	const location = useLocation();
	let board = location.state;
	if(board != null){
		add(board);
		location.state = null;
	}
	return (
		<main>
      <div className='homes'>
        <table>
          <thead>
            <tr>
              <h1>Movies</h1>
              <th>ID</th>
              <th>Title</th>
              <th>Genre</th>
              <th>Release Date</th>
              <th>Action</th>
            </tr>
          </thead>
          <tbody>
            {list.length == 0 ?
              <tr><th colSpan={4}><h1>등록된 게시글이 없습니다.</h1></th></tr> :
              list.map(item=>{
                return(
                  <tr key={item.id}>
                    <td>{item.id}</td>
                    <td>{item.title}</td>
                    <td>{item.genre}</td>
                    <td>{item.release_date}</td>
                    <td><button onClick={()=>{deleteBoard(item.id)}}>삭제</button></td>
                  </tr>
                )
              })
            }
          </tbody>
        </table>
      </div>
		</main>
	)
}

function Insert({list, add}){
	const navigate = useNavigate();
	const [id, setId] = useState('');
	const [title, setTitle] = useState('');
	const [genre, setGenre] = useState('');
  const [release_date, setRelease_date] = useState('');

	const idChange = e => setId(e.target.value);
	const titleChange = e => setTitle(e.target.value);
	const genreChange = e => setGenre(e.target.value);
  const release_dateChange = e => setRelease_date(e.target.value);

	const insertBoard = ()=>{
    if (id && title && genre && release_date) {
      const isDuplicate = list && list.some((item) => item.id === parseInt(id, 10));
      if (isDuplicate) {
        alert('같은 ID를 가진 영화가 이미 존재합니다. 다른 ID를 선택해주세요.');
      } else {
        add({
          id: id,
          title: title,
          genre: genre,
          release_date: release_date,
        });
        navigate('/');
      }
    } else {
      alert('영화를 추가하기 전에 모든 필드를 입력해주세요.');
    }
  };
	return (
		<div className='crMovie'>
      <h1>Create Movie</h1>
			<input type="number" placeholder='input movie id' onChange={idChange} value={id}/> 
			<br/>
			<input type="text" placeholder='input movie title' onChange={titleChange} value={title}/>
			<br/>
			<input type="text" placeholder='input movie genre' onChange={genreChange} value={genre}/>
			<br/>
      출시일:<input type="date" onChange={release_dateChange} value={release_date}/>
      <br/>
			<button onClick={insertBoard}>Add Movie</button>
		</div>
	)
}

export default App;
